public class func{
public void addMinute(Date source,int min){
    Calendar cal = Calendar.getInstance();
    cal.setTime(source);
    cal.add(Calendar.MINUTE, min);
    return cal.getTime();
}
}
