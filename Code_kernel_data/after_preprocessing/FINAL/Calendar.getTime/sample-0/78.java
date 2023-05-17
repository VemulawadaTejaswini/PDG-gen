public class func{
public void newDate(int year,int month,int day,int hour,int minute,int second,TimeZone tz){
        Calendar cal = Calendar.getInstance(tz);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
