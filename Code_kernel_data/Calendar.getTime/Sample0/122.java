//121
public class func{
	public void getDateAtMidnight(Date date,TimeZone timeZone){
    Calendar calendar = new GregorianCalendar(timeZone);
    calendar.setTime(date);
    calendar.set(Calendar.MILLISECOND, 0);
    return calendar.getTime();
}
}
