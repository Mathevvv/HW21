package badCode.d;

class NotificationService {
    private Sendable sendable;

    NotificationService(Sendable sendable) {
        this.sendable = sendable;
    }


    void sendNotification(String recipient, String message) {

            sendable.send(recipient, message);

    }
}
