//44
public class func{
	public void getCacheControlExpiresDate(){
    cal.setTime(getDate());
    cal.add(Calendar.SECOND, seconds);
    return cal.getTime();
}
}
