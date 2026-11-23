package com.example.ironwill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.ironwill.ui.navigation.AppNavigation
import com.example.ironwill.ui.theme.IronWillTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IronWillTheme {
                AppNavigation()
            }
        }
    }
}