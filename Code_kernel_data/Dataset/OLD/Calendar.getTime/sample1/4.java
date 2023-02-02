//3
public class func{
	public void testMidnightCalendars(){
    final Calendar utcCal = CalendarUtils.getUTCMidnightCalendar(CalendarTestUtils.createDate("2012-12-23 08:33:24.123", timeZone), timeZone);
    Assert.assertEquals("2012-12-23 00:00:00.000", CalendarTestUtils.formatUTCIsoDate(utcCal.getTime()));
    final Calendar userCal = CalendarUtils.getMidnightCalendarFromUTC(utcCal.getTime(), timeZone);
    Assert.assertEquals("2012-12-22 23:00:00.000", CalendarTestUtils.formatUTCIsoDate(userCal.getTime()));
}
}
