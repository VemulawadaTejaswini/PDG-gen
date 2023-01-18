//143
public class func{
	public void getPrecedingMidnight(Date date){
        cal.setTimeInMillis(date.getTime() - 1000);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
