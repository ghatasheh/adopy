package com.example.androiddevchallenge.features.details

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.features.list.data.Dog
import com.example.androiddevchallenge.features.list.data.Gender
import com.example.androiddevchallenge.features.list.data.dogsList
import com.example.androiddevchallenge.ui.theme.AdopyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DetailsPage(
    dog: Dog,
    navigateBack: () -> Unit
) {
    Surface(color = MaterialTheme.colors.surface) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            BuildHeader(dog = dog)

            Column(modifier = Modifier.padding(16.dp)) {
                BuildRow(key = "Breed", value = dog.breed)
                BuildRow(key = "Age", value = dog.age)
                BuildRow(key = "Gender", value = when(dog.gender) {
                    Gender.Male -> "Male"
                    else -> "Female"
                })
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

        Box(modifier = Modifier
            .background(color = Color(0xAA333333))
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .fillMaxSize()) {
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
//
//@Preview(widthDp = 320, heightDp = 640)
//@Composable
//fun Preview() {
//    AdopyTheme(darkTheme = true) {
//        DetailsPage(dog = dogsList.first(), navigateBack = { })
//    }
//}