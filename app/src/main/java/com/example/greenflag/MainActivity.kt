package com.example.greenflag

import android.R.attr.start
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenflag.ui.theme.GreenFlagTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreenFlagTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}




@Preview
@Composable

fun Home(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)

    ) {

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=32.dp)
            ,

            ){
            Text(text = "GreenFlag",
                fontSize = 60.sp,
                color = Color.White)

            // painter
            val painter = painterResource(R.drawable.greenflag)
            //Coil image loading library

            Image(

                painter= painter,
                contentDescription = "My image",  // access
                modifier = Modifier
                    .size(60.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(32.dp)
        ){
            Text(text = " No Matter What",
                fontSize = 32.sp,
                color = Color(0xFF008000))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp),

            verticalAlignment = Alignment.CenterVertically    // vertical center
        ) {

            Column(
                modifier = Modifier.fillMaxSize()
                .padding(start=32.dp),
                verticalArrangement = Arrangement.Center

            ){


                Row {
                    Text(
                        color = Color.White,
                        text = "GreenFlag customers can",
                        fontSize = 26.sp,

                    )


                }
                Row {
                    Text(color = Color.White,
                        fontSize = 26.sp,
                        text = "create an account to access")
                }


                Row {
                    Text(color = Color.White,
                        fontSize = 18.sp,
                        text = "Car health updates")
                }
                Row {
                    Text(color = Color.White,
                        fontSize = 18.sp,
                        text = "Request a rescue online")
                }
                Row {
                    Text(color = Color.White,
                        fontSize = 18.sp,
                        text = "Policy Information")
                }
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { },
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF008000)       // green color
                )
                ) {
                Text("Create an Account")
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreenFlagTheme() {
        Greeting("Android")
    }
}















