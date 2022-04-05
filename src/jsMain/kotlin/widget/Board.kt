package widget

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Table
import org.jetbrains.compose.web.dom.Td
import org.jetbrains.compose.web.dom.Th
import org.jetbrains.compose.web.dom.Tr

@Composable
fun boardThree() {
    board(3)
}

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
                                            DigitBoard(1)
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
}
