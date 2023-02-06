//20
public class func{
public void testFriendlyFormatWithTime_ReturnsTodayAndTime_WhenDateIsToday(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(DateUtils.APPLICATION_TIME_ZONE));
        cal.set(Calendar.MINUTE, 30);
        assertEquals("Today at 14:30", df.formatAsDateWithTime(cal.getTime()));
}
}
