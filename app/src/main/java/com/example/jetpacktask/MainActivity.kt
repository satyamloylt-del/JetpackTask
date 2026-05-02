package com.example.jetpacktask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpacktask.ui.screen.mainscreen.MainScreen
import com.example.jetpacktask.ui.theme.JetpackTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackTaskTheme {
                MainScreen()
            }
        }
    }
}

