package com.example.laboratorio5
import androidx.compose.ui.platform.LocalContext
import android.graphics.Paint.Align
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio5.ui.theme.Laboratorio5Theme

class Navegador : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Navegador(".")
                }
            }
        }
    }
}

@Composable
fun Navegador(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Surface(color = Color.White) {
        Text(
            text = "Menu $name",
            modifier = modifier
                .fillMaxSize()
                .fillMaxWidth()
                .wrapContentSize(Alignment.TopCenter),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 25.sp
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (50).dp),
            colors = ButtonDefaults.buttonColors(
                containerColor =  Color(0xFFA7C957)
            )
        ){
            Text(text = "CAMPUS",
                color = Color.Black)
        }
        Button(
            onClick = {
                val intent = Intent(context, MyProfile::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (100).dp),
            colors = ButtonDefaults.buttonColors(
                containerColor =  Color(0xFFA7C957)
            )
        ){
            Text(text = "MI PROFILE",
                color = Color.Black)
        }
        Button(
            onClick = {
                val intent = Intent(context, Settings::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (150).dp),
            colors = ButtonDefaults.buttonColors(
                containerColor =  Color(0xFFA7C957)
            )
        ){
            Text(text = "SETTINGS",
                color = Color.Black)
        }
        Button(
            onClick = {
                val intent = Intent(context, EmergencyContacts::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (200).dp),
            colors = ButtonDefaults.buttonColors(
                containerColor =  Color(0xFFA7C957)
            )
        ){
            Text(text = "EMERGENCY CONTACTS",
                color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NavegadorPreview() {
    Laboratorio5Theme {
        Navegador("Central")
    }
}
