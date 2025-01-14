public class SMSProvider implements NotificationProvider {
    @Override
    public void sendNotification(String message, String recipient){
        // Send SMS Logic will be here
        System.out.println("SMS is sent to: " + recipient + " with message: "+ message);
    }
}

