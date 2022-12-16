package com.dreamlogix.ecomecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamlogix.ecomecompose.ui.theme.EcomeComposeTheme
import com.dreamlogix.ecomecompose.uiElements.CardViewW

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.height(200.dp)) {

                Row(
                    Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {


                    gerrting()
                    Spacer(modifier = Modifier.padding(10.dp))

                    Text(text = "just text")
                }
            }
        }
    }


    @Composable
    fun gerrting() {
CardViewW()
        }
    }


//    @Preview(showBackground = true)
//    @Composable
//    fun DefaultPreview() {
//        EcomeComposeTheme {
////            gerrting()
//        }
//    }
//}