package me.mauricioherrera.viewmodel.actividad


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

const val contador = "contador"
const val explicar = "explicacion"
@Composable
fun AppPrincipal() {
    val viewModel: ContadorViewModel = viewModel()
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            Row(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = { navController.navigate("contador") }) {
                    Text("Contador")
                }
                Button(onClick = { navController.navigate("explicacion") }) {
                    Text("¿Qué es?")
                }
            }
        }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = "contador",
            modifier = Modifier.padding(padding)
        ) {
            composable("contador") { VistaContador(viewModel) }
            composable("explicacion") { VistaExplicacion(viewModel) }
        }
    }
}