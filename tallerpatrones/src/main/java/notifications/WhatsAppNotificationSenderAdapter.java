/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifications;

/**
 *
 * @author DELL
 */
public class WhatsAppNotificationSenderAdapter implements NotificationSender{
    private WhatsAppNotificationSender whatsAppNotificationSender;

    public WhatsAppNotificationSenderAdapter(WhatsAppNotificationSender whatsAppNotificationSender) {
        this.whatsAppNotificationSender = whatsAppNotificationSender;
    }

    @Override
    public void send(String message) {
        whatsAppNotificationSender.sendWhatsAppMessage(message);
    }
}
