package com.example.mbti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.mbti.ui.theme.MbtiTheme

class EsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                EsScreen()
                val context = LocalContext.current
                Column {
                    Button(onClick = {
                        val intent = Intent(context, EsfpActivity::class.java)
                        context.startActivity(intent)
                    }) { Text(text = "ESFP") }
                    Button(onClick = {
                        val intent = Intent(context, EsfjActivity::class.java)
                        context.startActivity(intent)
                    }) { Text(text = "ESFJ") }
                    Button(onClick = {
                        val intent = Intent(context, EstpActivity::class.java)
                        context.startActivity(intent)
                    }) { Text(text = "ESTP") }
                    Button(onClick = {
                        val intent = Intent(context, EstjActivity::class.java)
                        context.startActivity(intent)
                    }) { Text(text = "ESTJ") }
                    Button(onClick = { finish() }) {
                        Text(text = "이전 화면")


                    }

                }
            }
        }
    }
}

@Composable
fun EsScreen() {

}
