package widget

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
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
val currentTarget: MutableState<Int?> = mutableStateOf(null)

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
                                        Th(attrs = {
                                            onClick { _ ->
                                                val aux = toIndex(it, iit, iiit, iiiit, size)
                                                if (currentTarget.value != null) {
                                                    if (currentTarget.value!! != aux) {
                                                        boardDto.value.data[currentTarget.value!!].focus.value =
                                                            false
                                                    }
                                                }
                                                currentTarget.value = aux
                                                boardDto.value.data[aux].focus.value = true
                                            }
                                        }) {
                                            DigitBoard(boardDto.value.data[toIndex(it, iit, iiit, iiiit, size)])
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
                    if (currentTarget.value != null) {
                        val aux = boardDto.value.data[currentTarget.value!!].initNum
                        aux.value = !aux.value
                    }
                }
            }
        ) { Text("Init Value") }
    }
    Div {
        repeat(size * size) { it ->
            Button(
                attrs = {
                    onClick { _ ->
                        if (currentTarget.value != null) {
                            boardDto.value.data[currentTarget.value!!].value.value = it + 1
                        }
                    }
                }
            ) { Text((it + 1).toString()) }
        }
    }
}

fun toIndex(it: Int, iit: Int, iiit: Int, iiiit: Int, size: Int): Int {
    return it * size * size * size + iit * size * size + iiit * size + iiiit
}
