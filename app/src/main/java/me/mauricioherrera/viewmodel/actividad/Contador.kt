package me.mauricioherrera.viewmodel.actividad

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

// VIEWMODEL (único): guarda el estado y la lógica.
// Sobrevive a cambios de configuración como rotar el celular.
class ContadorViewModel : ViewModel() {

    private val _contador = MutableStateFlow(0)
    val contador: StateFlow<Int> = _contador.asStateFlow()

    fun incrementar() = _contador.update { it + 1 }
    fun decrementar() = _contador.update { it - 1 }
    fun reiniciar() { _contador.value = 0 }
}