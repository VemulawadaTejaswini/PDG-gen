//97
public class func{
	public void getToday(Calendar calendar){
        Date today = calendar.getTime();
        today.setTime(today.getTime() / 1000L * 1000L);
        today.setHours(12);
        today.setMinutes(0);
        today.setSeconds(0);
}
}
