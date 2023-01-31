//99
public class func{
	public void tomorrow(){
    Calendar calendar = DateUtils.todayCalendar();
    return DateUtils.addDays(calendar.getTime(), 1);
}
}
