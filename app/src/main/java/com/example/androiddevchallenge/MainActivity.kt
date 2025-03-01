/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.features.details.DetailsPage
import com.example.androiddevchallenge.features.list.HomePage
import com.example.androiddevchallenge.features.list.ListViewModel
import com.example.androiddevchallenge.ui.theme.AdopyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdopyTheme {
                AdopyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun AdopyApp() {
    val viewModel: ListViewModel = viewModel()
    val navController = rememberNavController()
    NavHost(navController, startDestination = Router.HomePage.title) {
        composable(Router.HomePage.title) {
            HomePage(viewModel) {
                navController.navigate(Router.DetailPage.title + "/${it.name}")
            }
        }

        composable(Router.DetailPage.title + "/{name}") {
            val name = it.arguments?.getString("name")
            val dog = viewModel.find(name)
            DetailsPage(dog = dog, navigateBack = { navController.popBackStack() })
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    AdopyTheme {
        AdopyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    AdopyTheme(darkTheme = true) {
        AdopyApp()
    }
}
