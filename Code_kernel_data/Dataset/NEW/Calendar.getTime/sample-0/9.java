//9
public class func{
public void asDate(){
    if (timeZone != null) {
      c = Calendar.getInstance(timeZone);
    } else {
      c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }
    c.set(Calendar.MILLISECOND, 0);
    return c.getTime();
}
}
