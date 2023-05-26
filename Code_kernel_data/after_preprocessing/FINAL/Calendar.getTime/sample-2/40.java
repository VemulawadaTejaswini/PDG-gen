public class func{
public void getCycle(){
    calendar.setTime(new Date());
    calendar.add(Calendar.SECOND, 10);
    Date startTime = calendar.getTime();
    return iso8601(startTime);
}
}
