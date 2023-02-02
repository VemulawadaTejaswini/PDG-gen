//0
public class func{
	public void getExecutionDate(long repeatIntervalInSeconds){
    calendar.add(Calendar.SECOND, (int) repeatIntervalInSeconds);
    return calendar.getTime();
}
}
