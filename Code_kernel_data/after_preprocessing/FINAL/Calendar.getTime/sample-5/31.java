public class func{
public void testCalendarTimezoneRespected(){
        final String expectedValue = sdf.format(cal.getTime());
        final String actualValue = FastDateFormat.getInstance(PATTERN, this.timeZone).format(cal);
        assertEquals(expectedValue, actualValue);
}
}
