//84
public class func{
	public void newTime(int hour,int minute,int second){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"));
        cal.setTimeInMillis(0);
        cal.set(Calendar.SECOND, second);
        return cal.getTime();
}
}
