package module

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class DigitBoardDto(value: Int?, initNum: Boolean, val error: Boolean, val focus: Boolean) {
    val value: MutableState<Int?>
    val initNum: MutableState<Boolean>

    init {
        this.value = mutableStateOf(value)
        this.initNum = mutableStateOf(initNum)
    }
}
