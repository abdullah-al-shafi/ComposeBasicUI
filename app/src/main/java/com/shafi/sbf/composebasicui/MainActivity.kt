package com.shafi.sbf.composebasicui

import android.nfc.cardemulation.CardEmulation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shafi.sbf.composebasicui.ui.theme.ComposeBasicUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicUITheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(text = "Welcome Shafi to Jetpack Compose", style = MaterialTheme.typography.h4)

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Button(onClick = { /*TODO Action */ }) {
                Text(text = "Button 1")
            }
            Button(onClick = { /*TODO Action */ }) {
                Text(text = "Button 2")
            }

        }
        
        Spacer(modifier = Modifier.height(16.dp))

        LazyRow{
            items(listOf("Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7","Item 8","Item 9","Item 10")){item ->
                ListItemHorizontal(text = item)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn{
            items(listOf("Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7","Item 8","Item 9","Item 10")){item ->
            ListItem(text = item)
            }
        }


    }
}

@Composable
fun ListItem(text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = 4.dp
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.h5,

        )
    }
}

@Composable
fun ListItemHorizontal(text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp),
        elevation = 4.dp
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.h5,

        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMainScreen(){
    ComposeBasicUITheme {
        MainScreen()
    }
}

