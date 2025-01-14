// SERVICE ROLE
// Concrete implementation
public class EmailProvider implements NotificationProvider {
    @Override
    public void sendNotification(String message, String recipient){
        System.out.println("Email is sent from gmail server" + recipient + " with message: "+ message);
    }
}
