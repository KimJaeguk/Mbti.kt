package com.example.mbti

import android.app.Activity
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

class SubActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Column {
                    val context = LocalContext.current as? Activity

                    Button(onClick = {
                        val intent = Intent(context, EnActivity::class.java)
                        context?.startActivities(arrayOf(intent))
                    }) {
                        Text(text = "EN의 성향 MBTI")

                    }
                    Button(onClick = {
                        val intent = Intent(context, EsActivity::class.java)
                        context?.startActivities(arrayOf(intent))
                    }) {
                        Text(text = "ES의 성향 MBTI")
                    }
                    Button(onClick = {
                        finish()
                    }) {
                        Text(text = "뒤로 가기")

                    }
                }
            }
        }
    }

    @Composable
    fun SubScreen() {

    }
}