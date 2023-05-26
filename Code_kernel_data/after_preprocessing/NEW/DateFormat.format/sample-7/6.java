//6
public class func{
public void toCookieDate(Date date){
    DateFormat fmt = new SimpleDateFormat(COOKIE_DATE_FORMAT_STRING, Locale.US);
    fmt.setTimeZone(tz);
    return fmt.format(date);
}
}
