package OCP.Example1.BetterCode;

import OCP.Example1.ProblematiCode.NotificationType;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<Notification> notifications){
        for(Notification notification : notifications){
           notification.send();
        }
    }
}
