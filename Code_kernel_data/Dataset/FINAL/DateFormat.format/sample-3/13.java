public class func{
public void testTimeZoneHandling(){
    format2.setTimeZone(calendar.getTimeZone());
    assertEquals("Jan 02, 2003 03:04:05 +0200", format2.format(calendar.getTime()));
}
}
