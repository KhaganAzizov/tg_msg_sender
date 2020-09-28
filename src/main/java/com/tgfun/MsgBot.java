package com.tgfun;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MsgBot extends TelegramLongPollingBot {
    private String Bot_Username = "fckambot";
    private String Bot_Token = "1330057563:AAGsjFS9JuaBCVyEEfajSLEEJR3ck77lJqI";
    SendMessage sendMessage;
    Message message;

    public void onUpdateReceived(Update update) {
        message = update.getMessage();
        sendMessage = new SendMessage();
        if (message.getText().equals("/start")) {
            try {
                sendMessage.setChatId(message.getChatId());
                sendMessage.setText("Hello");
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return Bot_Username;
    }

    public String getBotToken() {
        return Bot_Token;
    }
}
