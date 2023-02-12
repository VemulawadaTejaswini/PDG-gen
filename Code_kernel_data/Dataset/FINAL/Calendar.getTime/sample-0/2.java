public class func{
public void unifyDateTime(Date date,Date time){
    Calendar timeCalender = getCalendar();
    timeCalender.setTime(time);
    calendar.set(Calendar.HOUR_OF_DAY, timeCalender.get(Calendar.HOUR_OF_DAY));
    calendar.set(Calendar.MINUTE, timeCalender.get(Calendar.MINUTE));
    calendar.set(Calendar.SECOND, timeCalender.get(Calendar.SECOND));
    return calendar.getTime();
}
}
