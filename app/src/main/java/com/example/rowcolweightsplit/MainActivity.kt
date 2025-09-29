package com.example.rowcolweightsplit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rowcolweightsplit.ui.theme.RowColWeightSplitTheme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RowColWeightSplitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RowColWeight()
                }
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

@Composable

fun RowColWeight() {
    Row(
        modifier = Modifier
            .fillMaxSize() //needed for weight to work properly
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(0.25f)
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Left section 25% width",
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
        Column(
            modifier = Modifier
                .weight(0.75f)
        ){
            Box(
                modifier = Modifier
                    .weight(2f)
                    .padding(8.dp)
                    .background(Color(0xFF2196F3)),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "child 1 of proportion weight 2",
                    textAlign = TextAlign.Center
                )
            }
            Box(
                modifier = Modifier
                    .weight(3f)
                    .padding(8.dp)
                    .background(Color(0xFFFF9800)),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "child 2 of proportion weight 3 ",
                    textAlign = TextAlign.Center
                )
            }
            Box(
                modifier = Modifier
                    .weight(5f)
                    .padding(8.dp)
                    .background(Color(0xFF9C27B0)),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "child 3 of proportion weight 5",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RowColWeightSplitTheme {
        Greeting("Android")
    }
}

