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

class EstjActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Estjscreen()
            }
        }
    }

    @Composable
    fun Estjscreen() {
        Column {
            Text(text = "ESTJ")
            Image(
                painter = painterResource(id = R.drawable.estj),
                contentDescription = "estj"
            )
            Button(onClick = { finish() }) {
                Text(text = "이전 화면")
            }
        }
    }
}