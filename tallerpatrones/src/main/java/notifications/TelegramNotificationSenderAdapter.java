/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifications;

/**
 *
 * @author DELL
 */
public class TelegramNotificationSenderAdapter implements NotificationSender{
    private TelegramNotificationSender telegramNotificationSender;

    public TelegramNotificationSenderAdapter(TelegramNotificationSender telegramNotificationSender) {
        this.telegramNotificationSender = telegramNotificationSender;
    }

    @Override
    public void send(String message) {
        telegramNotificationSender.sendTelegramMessage(message);
    }
}
