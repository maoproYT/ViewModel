package me.mauricioherrera.viewmodel.actividad


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Explica el concepto y funciona tambien con viewmodel.
@Composable
fun VistaExplicacion(viewModel: ContadorViewModel) {
    val contador by viewModel.contador.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("¿Qué es un ViewModel?", fontSize = 28.sp)
        Text(
            "Es una clase que guarda y gestiona el estado de la interfaz, " +
                    "separando la lógica de la vista (View)."
        )
        Text("Ventajas:", fontSize = 20.sp)
        Text("• Sobrevive a rotaciones de pantalla.")
        Text("• La vista solo muestra datos, no tiene lógica.")
        Text("• Varias vistas pueden compartir el mismo estado.")
        Spacer(Modifier.height(8.dp))
        Card(Modifier.fillMaxWidth()) {
            Text(
                "Valor actual desde el ViewModel: $contador",
                modifier = Modifier.padding(16.dp),
                fontSize = 20.sp
            )
        }
    }
}