//11
public class func{
	public void now(){
    cal.set(Calendar.HOUR_OF_DAY, nowCalendar.get(Calendar.HOUR_OF_DAY));
    cal.set(Calendar.MINUTE, nowCalendar.get(Calendar.MINUTE));
    NSTimestamp now = new NSTimestamp(cal.getTime());
}
}
