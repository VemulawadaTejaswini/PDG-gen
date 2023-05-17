//117
public class func{
public void computeStartOfNextDay(long now){
    cal.setTime(new Date(now));
    cal.add(Calendar.DAY_OF_MONTH, 1);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    return cal.getTime().getTime();
}
}
