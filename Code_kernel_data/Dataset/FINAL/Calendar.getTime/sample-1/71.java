public class func{
public void getAsDate(TimeZone timeZone){
    Calendar c = getAsCalendar(timeZone);
    return c.getTime();
}
}
