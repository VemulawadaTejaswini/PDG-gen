//6
public class func{
public void getReturnDate(){
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    c.add(Calendar.DAY_OF_YEAR, 14);
    return c.getTime();
}
}
