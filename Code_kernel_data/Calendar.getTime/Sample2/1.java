//0
public class func{
	public void isValid(int timeoutInSeconds){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(timestamp);
            calendar.add(Calendar.SECOND, timeoutInSeconds);
            return calendar.getTime().after(now);
}
}
