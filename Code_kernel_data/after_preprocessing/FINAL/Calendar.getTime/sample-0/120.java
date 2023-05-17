public class func{
public void getLocalizedDate(int year,int month,int day){
    Calendar calendar = new GregorianCalendar();
    calendar.clear();
    calendar.set(Calendar.MILLISECOND, 999);
    return df.format(calendar.getTime());
}
}
