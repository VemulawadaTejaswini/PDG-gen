//0
public class func{
public void atDateAtTime(long now,Calendar startDate){
    c.set(Calendar.HOUR_OF_DAY, startDate.get(Calendar.HOUR_OF_DAY));
    c.set(Calendar.MINUTE, startDate.get(Calendar.MINUTE));
    c.set(Calendar.SECOND, startDate.get(Calendar.SECOND));
    c.set(Calendar.MILLISECOND, startDate.get(Calendar.MILLISECOND));
    return c.getTime();
}
}
