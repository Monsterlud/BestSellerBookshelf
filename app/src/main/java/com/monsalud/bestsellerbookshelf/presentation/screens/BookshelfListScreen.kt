package com.monsalud.bestsellerbookshelf.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BookshelfListScreen(
    urlEndpoint: String,
    onClick: (Int) -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable { onClick(6789) },
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(
                text = "Best Sellers List Screen",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            Text(
                text = "$urlEndpoint",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(8.dp),
            )

        }
    }
}

@Composable
@Preview
fun BestSellersListScreenPreview() {
    BookshelfListScreen("", onClick = {})
}