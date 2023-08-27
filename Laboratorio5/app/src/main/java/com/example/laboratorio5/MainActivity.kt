package com.example.laboratorio5

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.laboratorio5.ui.theme.Laboratorio5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting("Central")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.White) {
        Text(
            text = "Campus $name",
            modifier = modifier
                .fillMaxSize()
                .fillMaxWidth()
                .wrapContentSize(Alignment.TopCenter),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.imagen1),
            contentDescription = null,
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
                .offset(y = (-275).dp)
                .aspectRatio(1F)
        )
        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "DESTACADOS",
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.CenterStart)
                .offset(y = (-115).dp)
                .offset(x = (25).dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Gray
        )
        Image(
            painter = painterResource(id = R.drawable.imagen2),
            contentDescription = null,
            modifier = modifier
                .wrapContentSize(Alignment.BottomEnd)
                .fillMaxSize()
        )
        Text(
            text = "SERVICIOS Y RECURSOS",
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.BottomStart)
                .offset(y = (-275).dp)
                .offset(x = (25).dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Gray
        )
        Image(
            painter = painterResource(id = R.drawable.imagen3),
            contentDescription = null,
            modifier = modifier
                .offset(y = (265).dp)
                .fillMaxSize()
        )
    }
}

@Composable
fun NewPage() {
    // Contenido de la nueva página
    // Puedes agregar aquí tus Text, Image, y otros componentes
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio5Theme {
        Greeting("Central")
    }
}