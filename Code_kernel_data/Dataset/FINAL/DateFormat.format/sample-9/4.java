public class func{
public void formatDateBase(long date,String format,String timeZone){
        if (timeZone != null) {
            simpleFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        } else {
            simpleFormat.setTimeZone(TimeZone.getDefault());
        }
        return simpleFormat.format(date);
}
}
