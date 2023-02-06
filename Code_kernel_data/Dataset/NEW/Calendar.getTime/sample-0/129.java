//129
public class func{
public void testParse(){
        calendar.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
        calendar.set(Calendar.MILLISECOND, 0);
        assertEquals(calendar.getTime(), newValue);
}
}
