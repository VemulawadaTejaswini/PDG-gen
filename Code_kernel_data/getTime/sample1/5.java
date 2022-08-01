//4
public class func{
	public void getDayOfYear(Calendar c){
    Calendar c2 = Calendar.getInstance(c.getTimeZone());
        c2.setTime(c.getTime());
        c2.set(Calendar.DAY_OF_MONTH, 1);
        long diff = c.getTime().getTime() - c2.getTime().getTime();
        return (int)Math.ceil((double)diff / MILLIS_PER_DAY);        
}
}
