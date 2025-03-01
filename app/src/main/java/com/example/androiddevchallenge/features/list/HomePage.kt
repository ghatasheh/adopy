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
package com.example.androiddevchallenge.features.list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.res.stringResource
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.features.list.data.Dog

@Composable
fun HomePage(viewModel: ListViewModel, onItemClick: (Dog) -> Unit) {
    val state = viewModel.dogs.observeAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(R.string.app_name))
                }
            )
        },
        content = { padding ->
            HomeContent(
                state = state,
                onItemClick = onItemClick
            )
        }
    )
}

@Composable
fun HomeContent(
    state: State<List<Dog>?>,
    onItemClick: (Dog) -> Unit
) {
    Surface(color = MaterialTheme.colors.background) {
        val list = state.value ?: emptyList()
        if (list.isEmpty()) {
            HomeNoContent()
        } else {
            HomeList(list, onItemClick)
        }
    }
}

@Composable
fun HomeNoContent() {
    Text(text = "No content!")
}
