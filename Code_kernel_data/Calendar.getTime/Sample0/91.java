//90
public class func{
	public void aStartDayIn10YearsAfter(final Date date){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.YEAR, 10);
    calendar.set(java.util.Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
    return date2SQLDate(calendar.getTime());
}
}
