//86
public class func{
	public void getXDaysAgo(int numberOfDays){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(APPLICATION_TIME_ZONE));
        cal.add(Calendar.DAY_OF_MONTH, -numberOfDays);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
