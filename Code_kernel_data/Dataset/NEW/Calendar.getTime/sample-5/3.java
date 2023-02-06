//3
public class func{
public void getRemainingTime(){
    long millis = (long) (seconds * 1000);
    cal.setTimeInMillis(millis);
    return dateFormat.format(cal.getTime());
}
}
