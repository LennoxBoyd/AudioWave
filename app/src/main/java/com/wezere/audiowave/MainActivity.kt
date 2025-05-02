package com.wezere.audiowave

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wezere.audiowave.ui.theme.AudioWaveTheme
//import com.wezere.audiowave.ui.theme.Navigation.AppNAvHost
import com.wezere.audiowave.ui.theme.Navigation.AppNavHost
import com.wezere.audiowave.ui.theme.Navigation.ROUTE_ONBOARD

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AudioWaveTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   AppNavHost()

                }
            }
        }
    }
}

