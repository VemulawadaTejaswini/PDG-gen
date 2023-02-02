//115
public class func{
	public void getTimestampAsDate(long timestamp){
    Calendar cd = Calendar.getInstance();
    cd.setTimeInMillis(timestamp);
    cd.set(Calendar.MILLISECOND, 0);
    return cd.getTime();
}
}
