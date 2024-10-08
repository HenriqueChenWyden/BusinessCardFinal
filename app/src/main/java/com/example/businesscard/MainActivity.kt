package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import org.jetbrains.annotations.ApiStatus.NonExtendable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    BusinessCardInfo1()
                    BusinessCardInfo2()
                }

            }
        }
    }
}

@Composable
fun BusinessCardInfo1() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.images)
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(R.string.name),
            modifier = Modifier.padding(top = 10.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.White
        )
        Text(
            text = stringResource(R.string.title),
            modifier = Modifier.padding(top = 3.dp),
            fontSize = 25.sp,
            color = Color.White
        )
    }
}

@Composable
fun BusinessCardInfo2() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Icon(Icons.Rounded.Phone, contentDescription = "None", tint = Color.White)
            Text(
                text = stringResource(R.string.phone),
                modifier = Modifier.padding(start = 5.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.White
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Icon(Icons.Rounded.Share, contentDescription = "None", tint = Color.White)
            Text(
                text = stringResource(R.string.social_media),
                modifier = Modifier.padding(start = 5.dp),
                fontSize = 15.sp,
                color = Color.White
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 10.dp, bottom = 8.dp)
        ) {
            Icon(Icons.Rounded.Email, contentDescription = "None", tint = Color.White)
            Text(
                text = stringResource(R.string.email),
                modifier = Modifier.padding(start = 5.dp),
                fontSize = 15.sp,
                color = Color.White
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardInfo1()
        BusinessCardInfo2()
    }
}