public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailProvider());
        emailService.sendNotification("This is a test message", "John Doe");

        NotificationService smsService = new NotificationService(new SMSProvider());

        smsService.sendNotification("This is a test sms" , "Donald trump");
    }
}