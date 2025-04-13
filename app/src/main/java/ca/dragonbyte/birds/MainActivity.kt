package ca.dragonbyte.birds

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ca.dragonbyte.birds.data.Bird
import ca.dragonbyte.birds.data.birds
import ca.dragonbyte.birds.ui.theme.BirdsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirdsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    BirdApp()
                }
            }
        }
    }
}

@Composable
fun BirdApp() {
    Scaffold (
        topBar = {
            BirdTopAppBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(birds) {
                BirdItem(
                    bird = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BirdTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.app_quip),
                    style = MaterialTheme.typography.displayMedium
                )
            }
        },
        modifier = modifier
    )
}

@Composable
fun BirdItem(
    bird: Bird,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (expanded) MaterialTheme.colorScheme.tertiaryContainer
        else MaterialTheme.colorScheme.primaryContainer
    )
    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )

                )
                .background(color = color)
                .padding(top = dimensionResource(R.dimen.padding_medium))
        )
        {
            Row() {
                Column (
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_medium)
                    )
                )
                    {
                    Text(text = stringResource(bird.commonName))
                    Text(text = stringResource(bird.scientificName))
                }
                Spacer(Modifier.weight(1f))
                BirdItemButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded },
                )

            }

            BirdImage(bird.imageResourceId, bird.commonName)


            if (expanded) {
                BirdDescription(
                    bird.description,
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_medium),
                        top = dimensionResource(R.dimen.padding_small),
                        end = dimensionResource(R.dimen.padding_medium),
                        bottom = dimensionResource(R.dimen.padding_medium)
                    )
                )
            }
        }
    }
}

@Composable
private fun BirdItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = if (expanded) Icons.Filled.KeyboardArrowDown else Icons.Filled.KeyboardArrowUp,
            contentDescription = stringResource(R.string.expand_button_content_description),
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun BirdImage(
    @DrawableRes birdImage: Int,
    @StringRes birdName: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            //.size(dimensionResource(R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small)),
            //.clip(MaterialTheme.shapes.small),
        //contentScale = ContentScale.Crop,
        painter = painterResource(birdImage),
        contentDescription = stringResource(birdName)
    )
}

@Composable
fun BirdDescription(
    @StringRes birdDescription: Int,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(birdDescription),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Preview
@Composable
fun BirdPreviewLight() {
    BirdsTheme(darkTheme = false) {
        BirdApp()
    }
}

@Preview
@Composable
fun BirdPreviewDark() {
    BirdsTheme(darkTheme = true) {
        BirdApp()
    }
}