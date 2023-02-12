public class func{
public void getFormattedDate(@NonNull Date date,@NonNull TimeZone timeZone,@NonNull Context context,@NonNull String separator){
        final java.text.DateFormat format = android.text.format.DateFormat.getDateFormat(context);
        format.setTimeZone(timeZone); // Hack to shift the timezone appropriately
        final String formattedDate = format.format(date);
}
}
