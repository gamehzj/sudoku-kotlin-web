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
    val bacClo: CSSColorValue
    val textClo: CSSColorValue
    val text: String = if (boardDto.value.value == null) {
        ""
    } else {
        boardDto.value.value.toString()
    }
    if (boardDto.focus) {
        bacClo = Color.blue
        textClo = if (boardDto.error) {
            Color.red
        } else {
            Color.white
        }
    } else {
        bacClo = Color.transparent
        textClo = if (boardDto.error) {
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
                color(textClo)
                backgroundColor(bacClo)
            }
        } // inline style
    ) {
        Text(text)
    }
}
