package module

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class DigitBoardDto(value: Int?, val initNum: Boolean, val error: Boolean) {
    val value: MutableState<Int?>

    init {
        this.value = mutableStateOf(value)
    }
}
