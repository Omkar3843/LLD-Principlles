package OCP.Example1.BetterCode;

public class PushNotification implements Notification{
    @Override
    public void send() {
        System.out.println("sending push notification");
    }
}
