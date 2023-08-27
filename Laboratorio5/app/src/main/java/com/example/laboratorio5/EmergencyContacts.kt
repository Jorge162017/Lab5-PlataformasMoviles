package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Divider
import androidx.compose.foundation.layout.padding
import com.example.laboratorio5.ui.theme.Laboratorio5Theme

class EmergencyContacts : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background,
                ) {
                    EmergencyContacts("Contacts")
                }
            }
        }
    }
}

@Composable
fun EmergencyContacts(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.White) {
        Text(
            text = "Emergency $name",
            modifier = modifier
                .fillMaxSize()
                .fillMaxWidth()
                .wrapContentSize(Alignment.TopCenter),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 25.sp
        )


        Image(
            painter = painterResource(id = R.drawable.imagen6),
            contentDescription = null,
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.CenterStart)
                .offset(y = (-320).dp, x = (10).dp)
                .size(width = 75.dp, height = 75.dp)

        )


        Text(
            text = "Emergencias",
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.CenterStart)
                .offset(y = (-340).dp)
                .offset(x = (100).dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Black
        )
        Text(
            text = "Si se presenta un incidente o un percance " +
                    "por favor marca al número de emergencia y " +
                    "rápidamente te apoyamos",
            modifier = modifier
                .fillMaxSize()
                .padding(vertical = 15.dp)
                .wrapContentSize(Alignment.CenterStart)
                .offset(y = (-290).dp)
                .offset(x = (100).dp),
            fontSize = 15.sp,
            color = Color.Black
        )
        Image(
            painter = painterResource(id = R.drawable.imagen8),
            contentDescription = null,
            modifier = modifier
                .fillMaxSize()
                .offset(y = (-220).dp)
        )
        Text(
            text = "Clínica UVG",
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.BottomStart)
                .offset(y = (-560).dp)
                .offset(x = (100).dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Black
        )
        Icon(painter = painterResource(id = R.drawable.baseline_cancel_24),
            contentDescription = null,
            modifier = modifier
                .offset(y = (5).dp)
                .offset(x = (10).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.imagen7),
            contentDescription = null,
            modifier = modifier
                .wrapContentSize(Alignment.BottomCenter)
                .offset(y = (247).dp)
                .size(width = 105.dp, height = 105.dp)
        )
        Text(
            text = "La clinica UVG presta los siguientes servicios :" +
                    "- Atencion a emergencias" +
                    "- Atencion primaria a enfermedades comunes" +
                    "- Plan educacional sobre enfermedades " +
                    " " +
                    "Horario de atencion : 7:00 a.m. a 8:30 p.m" +
                    "Campus Central Edificio F 119 -120.",
            modifier = modifier
                .fillMaxSize()
                .padding(vertical = 15.dp)
                .wrapContentSize(Alignment.CenterStart)
                .offset(y = (-75).dp)
                .offset(x = (100).dp),
            fontSize = 15.sp,
            color = Color.Black
        )
        Image(painter = painterResource(id = R.drawable.imagen9),
            contentDescription = null,
            modifier = modifier.fillMaxSize()

        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (40).dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = modifier
                .padding(vertical = 16.dp)
                .offset(y = (230).dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = modifier
                .padding(vertical = 16.dp)
                .offset(y = (450).dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EmergencyContactsPreview() {
    Laboratorio5Theme {
        EmergencyContacts("Contacts")
    }

}