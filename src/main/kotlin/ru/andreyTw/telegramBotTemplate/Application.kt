package ru.andreyTw.telegramBotTemplate

import com.pengrad.telegrambot.TelegramBot
import com.pengrad.telegrambot.UpdatesListener
import com.pengrad.telegrambot.request.SendMessage
import java.io.File

fun main() {

    val bot = TelegramBot(File("botKey").readText())
    bot.setUpdatesListener { updates ->
        updates.forEach {
            bot.execute(SendMessage(it.message().chat().id(), TextPrinter().printText()))
        }
        UpdatesListener.CONFIRMED_UPDATES_ALL
    }

    while (true) {
    }

    bot.removeGetUpdatesListener()
    bot.shutdown()
}