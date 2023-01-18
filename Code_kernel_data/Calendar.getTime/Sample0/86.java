//85
public class func{
	public void testFriendlyFormatWithTime_ReturnsYesterdayAndTime_WhenDateIsYesterday(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(DateUtils.APPLICATION_TIME_ZONE));
        cal.add(Calendar.DAY_OF_YEAR, -1);
        cal.set(Calendar.MINUTE, 30);
        assertEquals("Yesterday at 14:30", df.formatAsDateWithTime(cal.getTime()));
}
}
