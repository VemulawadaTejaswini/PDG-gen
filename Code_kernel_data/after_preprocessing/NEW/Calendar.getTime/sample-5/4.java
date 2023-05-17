//4
public class func{
public void getEllapsedTime(){
    Calendar cal = Calendar.getInstance();
    long elapsed = cal.getTimeInMillis();
    cal.setTimeInMillis(elapsed);
    return dateFormat.format(cal.getTime());
}
}
