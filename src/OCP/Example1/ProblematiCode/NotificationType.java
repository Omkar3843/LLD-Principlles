package OCP.Example1.ProblematiCode;

public enum NotificationType {

    SMS,
    EMAIL,
    WHATSAPP;

    public static void sendSMSNotification() {
        System.out.println("Sending SMS");
    }

    public static void sendEMAILNotification() {
        System.out.println("Sending EMAIL");
    }

    public static void sendWHATSAPPNotification() {
        System.out.println("Sending WHATSAPP");
    }
}
