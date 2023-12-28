package com.sharmila.samplecomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.sharmila.samplecomposeapplication.ui.theme.SampleComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingImage(message = "Happy Birthday Sharmi !", "From Sarankan")
                }
            }
        }
    }
}

@Composable
fun GreetingText(greetingText:String, fromText:String){
    Column {
        Text(
            text = greetingText,
            fontSize = 60.sp,
            lineHeight = 70.sp,
            color = Color.Cyan
        )

        Text(
            text = fromText,
            fontSize = 50.sp,
            lineHeight = 60.sp,
            color = Color.Cyan
        )
    }
}

@Composable
fun GreetingImage(message:String, from:String, modifier: Modifier=Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
    Image(painter = image, contentDescription = message)
        GreetingText(greetingText = message, fromText =from )
}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SampleComposeApplicationTheme {
        GreetingImage(message = "Happy Birthday Sharmi !", "From Sarankan")
    }
}