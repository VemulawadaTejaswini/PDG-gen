public class func{
public void getTimestamp(Context context){
        java.text.DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(context);
        java.text.DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(context);
        if (dateFormat != null && timeFormat != null) {
            timestamp = dateFormat.format(now) + ' ' + timeFormat.format(now);
        }
}
}
