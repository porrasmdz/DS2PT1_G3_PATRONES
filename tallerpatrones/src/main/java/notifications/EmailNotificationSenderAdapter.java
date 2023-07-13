/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifications;

/**
 *
 * @author DELL
 */
public class EmailNotificationSenderAdapter implements NotificationSender {
    private EmailNotificationSender emailNotificationSender;

    public EmailNotificationSenderAdapter(EmailNotificationSender emailNotificationSender) {
        this.emailNotificationSender = emailNotificationSender;
    }

    @Override
    public void send(String message) {
        emailNotificationSender.sendEmail(message);
    }
}
