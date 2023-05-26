//87
public class func{
public void testTimestampFormat(){
        String timestamp = dateFormat.format(SystemTime.asDate());
        assertTrue("DateFormat should be \"dd/mon/yyyy:HH:mm:ss Z\"",
                timestamp.matches(regex));
}
}
