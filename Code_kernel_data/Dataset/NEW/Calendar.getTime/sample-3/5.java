//5
public class func{
public void dateToGDateTime(Date date){
    Calendar cal = new GregorianCalendar();
    cal.setTime(date);
    cal.add(Calendar.MILLISECOND,
        cal.getTimeZone().getOffset(cal.getTimeInMillis()));
    return new DateTime(cal.getTime());
}
}
