//172
public class func{
	public void getLastDayOfMonth(Date date){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    DateUtils.truncateTime(calendar);
    return calendar.getTime();
}
}
