public class func{
public void parse(String isodate){
    Calendar calendar = getCalendar(isodate);
    return calendar.getTime();
}
}
