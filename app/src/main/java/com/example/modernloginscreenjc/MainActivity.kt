package com.example.modernloginscreenjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.modernloginscreenjc.ui.theme.ModernLoginScreenJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModernLoginScreenJCTheme {
                LoginScreen()
            }
        }
    }
}