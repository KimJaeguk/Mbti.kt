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

class EnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                EnScreen()
                val context = LocalContext.current
                Column {
                    Button(onClick = {
                        val intent = Intent(context, EnfpActivity::class.java)
                        context.startActivity(intent)
                    }) { Text(text = "ENFP") }
                    Button(onClick = {
                        val intent = Intent(context, EnfjActivity::class.java)
                        context.startActivity(intent)
                    }) { Text(text = "ENFJ") }
                    Button(onClick = {
                        val intent = Intent(context, EntpActivity::class.java)
                        context.startActivity(intent)
                    }) { Text(text = "ENTP") }
                    Button(onClick = {
                        val intent = Intent(context, EntjActivity::class.java)
                        context.startActivity(intent)
                    }) { Text(text = "ENTJ") }
                    Button(onClick = { finish() }) {
                        Text(text =  "이전 화면")


                    }

                }
            }
        }
    }
}

@Composable
fun EnScreen() {

}