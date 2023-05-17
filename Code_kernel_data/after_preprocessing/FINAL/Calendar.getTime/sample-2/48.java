public class func{
public void computeStartOfNextHour(long now){
    cal.setTime(new Date(now));
    cal.set(Calendar.MINUTE, 0);
    cal.add(Calendar.HOUR, 1);
    return cal.getTime().getTime();
}
}
