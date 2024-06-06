package OCP.Example1.ProblematiCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<NotificationType> notificationtypes){
        for(NotificationType type : notificationtypes){
            if(type == NotificationType.SMS){
                NotificationType.sendSMSNotification();
            }
            if(type == NotificationType.EMAIL){
                NotificationType.sendEMAILNotification();
            }
            if(type == NotificationType.WHATSAPP){
                NotificationType.sendWHATSAPPNotification();
            }
        }
    }

}
