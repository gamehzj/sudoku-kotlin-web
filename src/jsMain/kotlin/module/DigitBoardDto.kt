package module

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class DigitBoardDto(value: Int?, initNum: Boolean, error: Boolean, focus: Boolean) {
    val value: MutableState<Int?>
    val initNum: MutableState<Boolean>
    val error: MutableState<Boolean>
    val focus: MutableState<Boolean>

    init {
        this.value = mutableStateOf(value)
        this.initNum = mutableStateOf(initNum)
        this.error = mutableStateOf(error)
        this.focus = mutableStateOf(focus)
    }

}
