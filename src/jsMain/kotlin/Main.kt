import org.jetbrains.compose.web.renderComposable
import widget.boardThree

fun main() {
    renderComposable(rootElementId = "root") {
        boardThree()
    }
}
