public class func{
public void getNotificationTimeString(Context c){
        if (notificationTime == null) return "";
        return dateFormat.format(notificationTime) + " " + timeFormat.format(notificationTime);
}
}
