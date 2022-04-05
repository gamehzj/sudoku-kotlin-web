package module

class BoardDto(size: Int) {

    val data: Array<Array<Array<Array<DigitBoardDto>>>>

    init {
        data = arrayOf(
            arrayOf(
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = true, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = true, error = true, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = true, error = true, focus = true),
                        DigitBoardDto(value = null, initNum = false, error = true, focus = true),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = true),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
            ),
            arrayOf(
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
            ),
            arrayOf(
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
                arrayOf(
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                    arrayOf(
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                        DigitBoardDto(value = null, initNum = false, error = false, focus = false),
                    ),
                ),
            ),
        )
    }
}
