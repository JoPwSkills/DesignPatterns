// Client ROLE
// Refactored NotificationService with dependency injection

public class NotificationService {
    private NotificationProvider notificationProvider;

    public NotificationService(NotificationProvider notificationProvider){ // Dependency injection
        this.notificationProvider = notificationProvider;
    }

    public void sendNotification(String message, String recipient){
        notificationProvider.sendNotification(message, recipient);
    }
}