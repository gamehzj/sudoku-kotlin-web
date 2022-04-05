package widget

import androidx.compose.runtime.Composable
import module.DigitBoardDto
import org.jetbrains.compose.web.dom.Text

@Composable
fun DigitBoard(boardDto: DigitBoardDto) {
    if (boardDto.value.value == null) {
        Text("")
    } else {
        Text(boardDto.value.value.toString())
    }
}
