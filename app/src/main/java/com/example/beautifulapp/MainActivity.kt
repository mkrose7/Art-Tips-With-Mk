package com.example.beautifulapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beautifulapp.ui.theme.BeautifulAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeautifulAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ArtTipsApp()
                }
            }
        }
    }
}

@Composable
fun ArtTipsApp() {
    Scaffold(
        topBar = {
            ArtwithmkTopAppBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(tips) {
                TipList(
                    tip = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}

//calls elements within a card and creates the layout
@Composable
fun TipList(
    tip: Tip,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            TipInformation(tip.number, tip.title)
            ArtImage(tip.imageResourceId)
            TipDescription(tip.description)
        }
    }
}

//image
@Composable
fun ArtImage(
    @DrawableRes artImage: Int,
    modifier: Modifier = Modifier
) {
    Column {
        Image(
            modifier = modifier
                .size(dimensionResource(R.dimen.image_size))
                .padding(dimensionResource(R.dimen.padding_small))
                .clip(MaterialTheme.shapes.small),
            contentScale = ContentScale.Crop,
            painter = painterResource(artImage),
            contentDescription = null
        )
    }
}

//tip number and title
@Composable
fun TipInformation(
    @StringRes number: Int,
    title: Int,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier) {
        Text(
            text = stringResource(number),
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
        Spacer(modifier = Modifier.width(30.dp))
        Text(
            text = stringResource(title),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
    }
}

//description text
@Composable
fun TipDescription(
    @StringRes description: Int
) {
    Text(
        text = stringResource(description),
        style = MaterialTheme.typography.displaySmall,
        modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
    )
}

//light theme
@Preview
@Composable
fun BeautifulAppPreview() {
    BeautifulAppTheme(darkTheme = false) {
        ArtTipsApp()
    }
}
//dark theme
@Preview
@Composable
fun WoofDarkThemePreview() {
    BeautifulAppTheme(darkTheme = true) {
        ArtTipsApp()
    }
}

//top stationary bar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArtwithmkTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.image_size_small))
                        .padding(dimensionResource(id = R.dimen.padding_small)),
                    painter = painterResource(R.drawable.artwithmkcharacter),
                    contentDescription = null
                )
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        },
        modifier = modifier
    )
}