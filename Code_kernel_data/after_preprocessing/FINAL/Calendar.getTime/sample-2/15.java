public class func{
public void addHour(Date source,int hour){
    Calendar cal = Calendar.getInstance();
    cal.setTime(source);
    cal.add(Calendar.HOUR_OF_DAY, hour);
    return cal.getTime();
}
}
