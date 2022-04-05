package widget

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import module.BoardDto
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Table
import org.jetbrains.compose.web.dom.Td
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Th
import org.jetbrains.compose.web.dom.Tr

@Composable
fun boardThree() {
    board(3)
}

val boardDto = mutableStateOf(BoardDto(size = 3))

@Composable
fun board(size: Int) {
    Table() {
        repeat(size) { it ->
            Tr {
                repeat(size) { iit ->
                    Td {
                        Table {
                            repeat(size) { iiit ->
                                Tr {
                                    repeat(size) { iiiit ->
                                        Th {
                                            DigitBoard(boardDto.value.data[it][iit][iiit][iiiit])
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    Div {
        Button(
            attrs = {
                onClick {
                }
            }
        ) { Text("Init Value") }
    }
    Div {
        repeat(size * size) { it ->
            Button(
                attrs = {
                    onClick { _ ->
                    }
                }
            ) { Text((it + 1).toString()) }
        }
    }
}
