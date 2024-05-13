package com.example.mbti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.mbti.ui.theme.MbtiTheme

class EntpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Entpscreen()
            }
        }
    }

    @Composable
    fun Entpscreen() {
        Column {
            Text(text = "ENTP")
            Image(
                painter = painterResource(id = R.drawable.entp),
                contentDescription = "entp"
            )
            Button(onClick = {finish()}) {
                Text(text = "이전 화면")

            }
        }
    }
}