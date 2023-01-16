//49
public class func{
	public void computeStartOfNextSecond(long now){
    cal.setTime(new Date(now));
    cal.set(Calendar.MILLISECOND, 0);
    cal.add(Calendar.SECOND, 1);
    return cal.getTime().getTime();
}
}
