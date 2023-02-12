public class func{
public void getTimeAfter(Date afterTime){
    Calendar date = new GregorianCalendar();
    date.setTime(afterTime);
    Calendar after = getTimeAfter(date);
    return after == null ? null : after.getTime();
}
}
