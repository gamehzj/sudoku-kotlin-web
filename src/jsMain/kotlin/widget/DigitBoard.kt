package widget

import androidx.compose.runtime.Composable
import module.DigitBoardDto
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun DigitBoard(boardDto: DigitBoardDto) {
    val bacCol: CSSColorValue
    val textCol: CSSColorValue
    val text: String = if (boardDto.value.value == null) {
        ""
    } else {
        boardDto.value.value.toString()
    }
    if (boardDto.focus) {
        bacCol = Color.blue
        textCol = if (boardDto.error) {
            Color.red
        } else {
            Color.white
        }
    } else {
        bacCol = Color.transparent
        textCol = if (boardDto.error) {
            Color.red
        } else if (boardDto.initNum.value) {
            Color.black
        } else {
            Color.blue
        }
    }
    Span(
        attrs = {
            style {
                color(textCol)
                backgroundColor(bacCol)
            }
        } // inline style
    ) {
        Text(text)
    }
}
