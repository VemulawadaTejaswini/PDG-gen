//29
public class func{
public void getTomorrow(){
    Calendar c = Calendar.getInstance();
    setZeroTime(c);
    c.add(Calendar.DATE, 1);
    return c.getTime();
}
}
