//11
public class func{
public void getDateDisplayString(TimeZone tz,Date time,String formatString){
        DateFormat df = new SimpleDateFormat(formatString);
        df.setTimeZone(tz);
        return df.format(time);
}
}
