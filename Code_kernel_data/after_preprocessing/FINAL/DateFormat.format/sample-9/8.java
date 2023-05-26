public class func{
public void localizedDateString(Timestamp stamp,TimeZone timeZone,Locale locale){
        DateFormat dateFormat = UtilDateTime.toDateFormat(null, timeZone, locale);
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(stamp);
}
}
