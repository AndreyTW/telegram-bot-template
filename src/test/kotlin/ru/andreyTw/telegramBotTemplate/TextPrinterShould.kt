package ru.andreyTw.telegramBotTemplate

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TextPrinterShould {

    @Test
    fun printExpectedText() {
        assertEquals("Hello world!", TextPrinter().printText())
    }

}
