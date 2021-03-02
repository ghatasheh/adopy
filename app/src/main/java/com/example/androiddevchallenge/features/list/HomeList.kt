package com.example.androiddevchallenge.features.list

import androidx.compose.animation.fadeIn
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
    Card(modifier = Modifier
        .padding(16.dp)
        .clickable { onItemClick(dog) }
        .fillMaxSize()) {
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