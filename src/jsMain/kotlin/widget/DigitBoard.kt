package widget

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Text

@Composable
fun DigitBoard(number: Int?) {
    if (number == null) {
        Text("")
    } else {
        Text(number.toString())
    }
}
