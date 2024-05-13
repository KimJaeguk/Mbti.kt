package com.example.mbti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.mbti.ui.theme.MbtiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        Column {

            val context = LocalContext.current
            Image(
                painter = painterResource(id = R.drawable.mbti1), contentDescription = "mbti1"
            )
            Image(
                painter = painterResource(id = R.drawable.mbti2), contentDescription = "mbti2"
            )
            Button(onClick = {
                val intent = Intent(context, SubActivity::class.java)
                context.startActivity(intent)
            }) {
                Text(text = "MBTI E 유형 확인하기")
            }

        }
    }
}


