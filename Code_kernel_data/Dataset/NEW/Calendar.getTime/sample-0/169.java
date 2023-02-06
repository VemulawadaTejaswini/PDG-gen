//169
public class func{
public void getStartOfDay(){
    Calendar cal = getCalendar();
    cal.set(Calendar.MILLISECOND, 1);
    return cal.getTime();
}
}
