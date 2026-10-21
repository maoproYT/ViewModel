package me.mauricioherrera.viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.mauricioherrera.viewmodel.actividad.AppPrincipal
import me.mauricioherrera.viewmodel.ui.theme.ViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewModelTheme {
                AppPrincipal()
            }
        }
    }
}