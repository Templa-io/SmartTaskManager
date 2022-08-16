package com.sefu.smarttaskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefu.smarttaskmanager.ui.theme.SmartTaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartTaskManagerTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    TopImage()
}

@Composable
fun TopImage(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.pic),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(bottomEnd = 28.dp, topEnd = 28.dp))
                    .size(height = 60.dp, width = 80.dp)
                    .background(color = Color.White)
            ) {
            }
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                    .size(height = 500.dp, width = 400.dp)
                    .background(color = Color.White)
            ) {
                TaskContent()
            }
        }
    }


}

@Composable
fun TaskContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Box(
            modifier = Modifier
                .background(color = Color.LightGray)
                .size(width = 52.dp, height = 4.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )

        Box(
            modifier = Modifier
                .size(28.dp)
                .align(alignment = Alignment.End), contentAlignment = Alignment.Center
        )
        {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(color = Color.Black)
                        .size(8.dp)
                ) {

                }
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(color = Color.Black)
                        .size(8.dp)
                ) {

                }
            }


        }
        TextContent()

    }

}


@Composable
fun TextContent(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxWidth().padding(
start=22.dp    ), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = "Smart Text\nManagement", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Text(text = "Try this tool to better manage your\n most important task", fontSize = 16.sp)
    }
    Spacer(modifier = Modifier.height(16.dp))
    Card(modifier = Modifier
        .padding(10.dp),elevation = 50.dp,shape = RoundedCornerShape(24.dp)

    ) {

            Column(
                modifier = Modifier
                    .padding(36.dp)
            ) {
                Text(text = "Wireframe progress", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Currently five people are reviewing\nThe progress in fairly good",
                    fontSize = 16.sp,
                    style = TextStyle(color = Color.Gray)
                )
                Spacer(modifier = Modifier.height(24.dp))
                BottomContent()
            }

    }

}

@Composable
fun BottomContent(modifier: Modifier = Modifier) {

    Box(modifier = modifier.size(300.dp), contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.size(width = 100.dp, height = 200.dp),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(id = R.drawable.lady), modifier = Modifier
                        .clip(shape = RoundedCornerShape(28.dp))
                        .align(alignment = Alignment.CenterStart)
                        .border(
                            width = 3.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(28.dp)
                        )
                        .size(50.dp), contentDescription = "Contact1"
                )
                Image(
                    painter = painterResource(id = R.drawable.boy), modifier = Modifier
                        .clip(shape = RoundedCornerShape(28.dp))
                        .align(alignment = Alignment.Center)
                        .border(
                            width = 1.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(28.dp)
                        )
                        .size(50.dp), contentDescription = "Contact2"

                )

                Image(
                    painter = painterResource(id = R.drawable.man), modifier = Modifier
                        .clip(shape = RoundedCornerShape(28.dp))
                        .align(alignment = Alignment.CenterEnd)
                        .border(
                            width = 3.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(28.dp)
                        )
                        .size(50.dp), contentDescription = "Contact4"

                )

            }
            Box() {
                CircularProgressIndicator(
                    progress = 0.65F,
                    modifier = Modifier
                        .size(42.dp)
                        .rotate(180f)
                        .align(alignment = Alignment.Center),
                    color = Color.Green,
                    strokeWidth = 4.dp
                )


                Text(
                    text = "65%",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(alignment = Alignment.Center)
                )
            }


        }
        Box(contentAlignment = Alignment.Center,modifier = Modifier
            .size(width = 400.dp, height = 150.dp)
            .padding(top=16.dp)
            .background(color = Color.White.copy(0.5F))) {
            Card(
                elevation = 20.dp,
                shape = RoundedCornerShape(36.dp),
                modifier = Modifier.padding(24.dp)
                )
            {

                    Icon(
                        Icons.Rounded.ArrowForward,
                        contentDescription = "Arrow",
                        modifier = Modifier
                            .size(100.dp)
                            .background(color = Color.Blue), tint = Color.White
                    )

            }
        }



    }


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

@Preview
@Composable
fun PreviewTaskContent() {
    SmartTaskManagerTheme {
        TaskContent()
    }
}

@Preview
@Composable
fun PreviewTextContent() {
    SmartTaskManagerTheme {
        TextContent()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomContent() {
    SmartTaskManagerTheme {
        BottomContent()
    }
}