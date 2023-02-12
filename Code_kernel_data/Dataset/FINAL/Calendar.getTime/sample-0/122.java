public class func{
public void getDate(int month,int day,int year){
    TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
    Calendar calendar = new GregorianCalendar(gmtTimeZone);
    calendar.set(Calendar.YEAR, year);
    return calendar.getTime();
}
}
