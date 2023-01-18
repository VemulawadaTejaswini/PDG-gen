//163
public class func{
	public void getEndOfDay(){
    Calendar cal = getCalendar();
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
}
}
