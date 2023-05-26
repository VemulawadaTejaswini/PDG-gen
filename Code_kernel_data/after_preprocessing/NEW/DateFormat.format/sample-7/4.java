//4
public class func{
public void formatDate(Date date,String pattern,TimeZone timezone){
    DateFormat formatter = new SimpleDateFormat(pattern, getLocale());
    formatter.setTimeZone(timezone);
    return formatter.format(date);
}
}
