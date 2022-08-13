package com.sefu.smarttaskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefu.smarttaskmanager.ui.theme.SmartTaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartTaskManagerTheme {

            }
        }
    }
}

@Composable
fun MainScreen() {
TopImage()
}

@Composable
fun TopImage(modifier: Modifier=Modifier) {
    Box(modifier=modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.pic), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop )
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.SpaceBetween) {
            Box(modifier = Modifier
                .clip(shape = RoundedCornerShape(bottomEnd = 28.dp, topEnd = 28.dp))
                .size(height = 60.dp, width = 80.dp)
                .background(color = Color.White)) {
            }
            Box(modifier = Modifier
                .clip(shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .size(height = 500.dp, width = 400.dp)
                .background(color = Color.White)) {

            }
        }
    }


}

@Composable
fun TaskContent() {
    
}

@Preview
@Composable
fun PreviewMainScreen() {
    SmartTaskManagerTheme {
        MainScreen()
    }
}
@Preview
@Composable
fun PreviewTopImage() {
    SmartTaskManagerTheme {
        TopImage()
    }
}