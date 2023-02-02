//107
public class func{
	public void timestamp(int year,int month,int day,int hour,int minute,int second){
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(year, month - 1, day, hour, minute, second);
    return calendar.getTime();
}
}
