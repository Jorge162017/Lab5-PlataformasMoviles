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

class Settings: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Settings("Settings")
                }
            }
        }
    }
}

@Composable
fun Settings(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.White) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .offset(x = (160).dp)
                .size(25.dp)
                .offset(y = (10).dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Icon(painter = painterResource(id = R.drawable.baseline_settings_24),
                contentDescription = null,
                modifier = modifier.wrapContentSize(Alignment.CenterStart)
                    .offset(x = (-320).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_person_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (25).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_email_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (50).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_notifications_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (75).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_privacy_tip_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (100).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_help_outline_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (150).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_error_outline_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (190).dp)
            )


        }

        Text(
            text = "$name",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (150).dp)
        )

        Text(text = "Edit Profile",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (70).dp, y = (55).dp)
        )
        Text(text = "Email Addresses",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (70).dp, y = (105).dp)
        )
        Text(text = "Notifications",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (70).dp, y = (155).dp)
        )
        Text(text = "Privacy",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (70).dp, y = (205).dp)
        )
        Text(text = "Help and Feedback",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (70).dp, y = (280).dp)
        )
        Text(text = "About",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (70).dp, y = (340).dp)
        )
        Text(text = "Logout",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (170).dp, y = (410).dp),
            color = Color.Red
        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (30).dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (80).dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (130).dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (180).dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (230).dp)
                .height(15.dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (310).dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (370).dp)
                .height(15.dp)
        )
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .offset(y = (430).dp)
                .height(410.dp)
        )

    }
}


@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    Laboratorio5Theme {
        Settings("Settings")
    }

}
