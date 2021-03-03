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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.transform.CircleCropTransformation
import com.example.androiddevchallenge.features.list.data.Dog
import com.example.androiddevchallenge.ui.theme.cardBackground
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun HomeList(list: List<Dog>, onItemClick: (Dog) -> Unit) {
    val scrollState = rememberLazyListState()

    LazyColumn(state = scrollState) {
        items(list.size) { index ->
            ListItem(list[index], onItemClick)
        }
    }
}

@Composable
fun ListItem(dog: Dog, onItemClick: (Dog) -> Unit) {
    Card(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable { onItemClick(dog) }
            .fillMaxSize(),
        backgroundColor = MaterialTheme.colors.cardBackground
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            CoilImage(
                data = dog.imageUrl,
                contentDescription = dog.name,
                modifier = Modifier.size(90.dp),
                fadeIn = true,
                requestBuilder = {
                    transformations(CircleCropTransformation())
                }
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(text = dog.name, style = MaterialTheme.typography.h6)
                Text(text = dog.breed, style = MaterialTheme.typography.subtitle2)
            }
        }
    }
}
