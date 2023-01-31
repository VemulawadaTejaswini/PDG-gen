//82
public class func{
	public void testFriendlyFormatWithoutTime_ReturnsTomorrow_WhenDateIsTomorrow(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(DateUtils.APPLICATION_TIME_ZONE));
        cal.add(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.MINUTE, 0);
        assertEquals("Tomorrow", df.formatAsDateWithoutTime(cal.getTime()));
}
}
