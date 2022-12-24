package com.dreamlogix.ecomecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dreamlogix.ecomecompose.uiElements.CardView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.height(200.dp)) {

                Row(
                    Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically
                ) {
                   cardDisplay()
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "just text")
                }
            }
        }
    }


    @Composable
    fun cardDisplay() {
CardView()
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