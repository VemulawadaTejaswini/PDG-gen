public class func{
public void testGMTAndLocalTimeZone(){
        String utcTime = format.format(utc.getTime().getTime());
        assertEquals(localTime, utcTime);
        local.setTimeZone(CompactCalendar.UTC);
        assertCalendarEquals(local, utc);
}
}
