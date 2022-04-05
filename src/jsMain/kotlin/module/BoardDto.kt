package module

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

class BoardDto(size: Int) {

    val data: SnapshotStateList<DigitBoardDto> = mutableStateListOf()

    init {
        repeat(size * size * size * size) {
            data.add(DigitBoardDto(value = null, initNum = false, error = false, focus = false))
        }
    }
}
