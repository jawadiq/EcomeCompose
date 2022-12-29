package com.dreamlogix.ecomecompose.uiElements

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Arrangement.Start
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.dreamlogix.ecomecompose.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardView() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(5.dp),colors = CardDefaults.cardColors(
            containerColor =  MaterialTheme.colorScheme.primary),elevation = CardDefaults.cardElevation(
            defaultElevation =  50.dp,
        ),
        shape = RoundedCornerShape(10.dp),border = BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Black), onClick = {

        },

        content = {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Surface(shape = RoundedCornerShape(80.dp)) {
                    Image(
                        painter = painterResource(R.drawable.ic_launcher_background),
                        contentDescription = null, // decorative
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp), alignment = BottomCenter
                    )
                }

                Text("tddjfngjd",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.labelLarge)

            }
        }
    )

}
fun toast(){
    val context: Context? = null
    Toast.makeText(context,"this",Toast.LENGTH_SHORT).show()

}




