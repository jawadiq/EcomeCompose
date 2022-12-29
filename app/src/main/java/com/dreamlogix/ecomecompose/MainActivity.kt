package com.dreamlogix.ecomecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamlogix.ecomecompose.uiElements.CardView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()) {
                cardDisplay()
                Spacer(modifier = Modifier.padding(5.dp, 0.dp, 5.dp, 5.dp))
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(), shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Button")

                }
            }
        }
    }


    @Composable
    fun cardDisplay() {
        CardView()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CardView()

}
