package com.example.androiddevchallenge.features.list

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.features.list.data.Dog

@Composable
fun HomePage(viewModel: ListViewModel, onItemClick: (Dog) -> Unit) {
    val state = viewModel.dogs.observeAsState()

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = stringResource(R.string.app_name))
            }
            )
        },
        content = { padding ->
            HomeContent(
                modifier = Modifier.padding(padding),
                state = state,
                onItemClick
            )
        }
    )
}

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
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
