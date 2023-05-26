public class func{
public void date(final int day,final int month,final int year){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    return calendar.getTime();
}
}
