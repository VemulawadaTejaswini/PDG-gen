public class func{
public void computeStartOfNextMinute(long now){
    cal.setTime(new Date(now));
    cal.set(Calendar.SECOND, 0);
    cal.add(Calendar.MINUTE, 1);
    return cal.getTime().getTime();
}
}
