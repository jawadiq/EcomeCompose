package com.dreamlogix.ecomecompose.uiElements

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardView() {
    Card(
        modifier = Modifier
            .fillMaxWidth().fillMaxHeight()
            .padding(5.dp),colors = CardDefaults.cardColors(
            containerColor =  MaterialTheme.colorScheme.primary),elevation = CardDefaults.cardElevation(
            defaultElevation =  20.dp,
        ),
        shape = RoundedCornerShape(10.dp),border = BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Black), onClick = {

        },

        content = {
            Text("Card with content argument",
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.labelLarge)
        }
    )
}
fun toast(){
    val context: Context? = null
    Toast.makeText(context,"this",Toast.LENGTH_SHORT).show()

}




