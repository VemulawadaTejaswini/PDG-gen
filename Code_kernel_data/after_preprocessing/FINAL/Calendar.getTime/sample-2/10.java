public class func{
public void addMonth(Date source,int month){
    Calendar cal = Calendar.getInstance();
    cal.setTime(source);
    cal.add(Calendar.MONTH, month);
    return cal.getTime();
}
}
