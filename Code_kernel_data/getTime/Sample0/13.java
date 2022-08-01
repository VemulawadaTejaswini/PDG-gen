//12
public class func{
	public void getDate(Date date,String hour){
    calendar.set(HOUR_OF_DAY, extractHour(hour));
    calendar.set(MINUTE, extractMinutes(hour));
    return calendar.getTime();
}
}
