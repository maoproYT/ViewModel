package me.mauricioherrera.viewmodel.actividad

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

// Aqui guardo la lógica
// Así es fácil de encontrar.
class ContadorViewModel : ViewModel() {

    private val mi_contador = MutableStateFlow(0)
    val contador: StateFlow<Int> = mi_contador.asStateFlow()

    fun incrementar() = mi_contador.update { it + 1 }
    fun decrementar() = mi_contador.update { it - 1 }
    fun reiniciar() { mi_contador.value = 0 }
}