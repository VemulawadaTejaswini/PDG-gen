public class func{
public void testFriendlyFormatWithoutTime_ReturnsYesterday_WhenDateIsYesterday(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(DateUtils.APPLICATION_TIME_ZONE));
        cal.add(Calendar.DAY_OF_YEAR, -1);
        assertEquals("Yesterday", df.formatAsDateWithoutTime(cal.getTime()));
}
}
