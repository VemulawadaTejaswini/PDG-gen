public class func{
public void getTime(int hour,int minutes,Boolean is24Hour){
    calendar.set(Calendar.SECOND, 0);
    truncateDate(calendar);
    return calendar.getTime();
}
}
