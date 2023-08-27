package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Divider
import androidx.compose.foundation.layout.padding
import com.example.laboratorio5.ui.theme.Laboratorio5Theme


class MyProfile: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme  {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Profile("Profile")
                }
            }
        }
    }
}

@Composable
fun Profile(name: String, modifier: Modifier = Modifier) {
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
                modifier = modifier.wrapContentSize(Alignment.Center)
                )
            Icon(painter = painterResource(id = R.drawable.baseline_landscape_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (345).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_people_alt_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (375).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_calendar_today_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (400).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_collections_bookmark_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (425).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_fact_check_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (450).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_group_work_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (475).dp)
            )
            Icon(painter = painterResource(id = R.drawable.baseline_push_pin_24),
                contentDescription = null,
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .offset(x = (-320).dp, y = (500).dp)
            )
            Image(painter = painterResource(id = R.drawable.imagen5),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .offset(x = (-160).dp, y = (-355).dp)
            )

            }

            Text(
                text = "My $name",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (150).dp)
            )
            Text(text = "JORGE LUIS LOPEZ 221038",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (300).dp, x = (70).dp)
            )
            Text(text = "My Campus",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (70).dp, y = (380).dp)
            )
            Text(text = "My Friends",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (70).dp, y = (430).dp)
            )
            Text(text = "My Calendar",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (70).dp, y = (480).dp)
            )
            Text(text = "My Courses",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (70).dp, y = (530).dp)
            )
            Text(text = "My Grades",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (70).dp, y = (580).dp)
            )
            Text(text = "My Groups",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (70).dp, y = (630).dp)
            )
            Text(text = "My Upcoming Events",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (70).dp, y = (680).dp)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset(y = (350).dp)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset(y = (400).dp)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset(y = (450).dp)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset(y = (500).dp)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset(y = (550).dp)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset(y = (600).dp)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset(y = (650).dp)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset(y = (700).dp)
            )

        }
}


@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    Laboratorio5Theme {
        Profile("Profile")
    }

}