//14
public class func{
public void formatDate(String formatString,Date date){
        DateFormat df = new SimpleDateFormat(formatString);
        df.setTimeZone(GMT_TIMEZONE);
        return df.format(date);
}
}
