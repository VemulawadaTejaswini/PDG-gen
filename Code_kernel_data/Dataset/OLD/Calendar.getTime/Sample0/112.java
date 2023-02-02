//111
public class func{
	public void getDefaultExpiration(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, defaultDuration);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
}
}
