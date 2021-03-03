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
package com.example.androiddevchallenge.features.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.features.list.data.Dog
import com.example.androiddevchallenge.features.list.data.Gender
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DetailsPage(
    dog: Dog,
    navigateBack: () -> Unit
) {
    Surface(color = MaterialTheme.colors.surface) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            BuildHeader(dog = dog)

            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                BuildRow(key = "Breed", value = dog.breed)
                BuildRow(key = "Age", value = dog.age)
                BuildRow(
                    key = "Gender",
                    value = when (dog.gender) {
                        Gender.Male -> "Male"
                        else -> "Female"
                    }
                )
                BuildRow(key = "Suitability", value = dog.suitability)
                BuildRow(key = "Live with another dog", value = dog.liveWithAnotherDog)
                BuildRow(key = "Live with cats", value = dog.liveWithCats)

                Spacer(modifier = Modifier.height(24.dp))
                Divider(color = MaterialTheme.colors.secondary)

                Spacer(modifier = Modifier.height(16.dp))

                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = dog.date,
                        color = MaterialTheme.colors.secondary,
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = dog.description)

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 48.dp, vertical = 16.dp),
                    onClick = { navigateBack() }
                ) {
                    Text(text = "Adopt me :D")
                }
            }
        }

        IconButton(onClick = navigateBack) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun BuildHeader(dog: Dog) {
    Box(contentAlignment = Alignment.BottomStart) {
        CoilImage(
            data = dog.imageUrl,
            contentDescription = dog.name,
            contentScale = ContentScale.Crop,
            fadeIn = true,
            modifier = Modifier.aspectRatio(1f, true)
        )

        Box(
            modifier = Modifier
                .background(color = Color(0xAA333333))
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .fillMaxSize()
        ) {
            Text(
                text = dog.name,
                style = MaterialTheme.typography.h5,
                color = Color.White
            )
        }
    }
}

@Composable
private fun BuildRow(key: String, value: String) {
    Spacer(modifier = Modifier.height(8.dp))
    Row {
        Text(text = key, color = MaterialTheme.colors.secondary)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = value)
    }
}
