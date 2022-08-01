//56
public class func{
	public void testToDateWithGYearMonth(){
        Calendar controlCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        controlCalendar.clear();
        controlCalendar.set(Calendar.MONTH, Calendar.MAY);
        Date controlDate = controlCalendar.getTime();
}
}
