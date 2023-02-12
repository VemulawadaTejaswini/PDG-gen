public class func{
public void startDocument(){
    Calendar cal = Calendar.getInstance();
    today = sdf.format(cal.getTime());
    cal.add(Calendar.DAY_OF_MONTH, 1);
    tomorrow = sdf.format(cal.getTime());
}
}
