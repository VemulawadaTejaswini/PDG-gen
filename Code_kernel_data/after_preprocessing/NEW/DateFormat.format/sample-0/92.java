//92
public class func{
public void testTimeFormat(){
    assertEquals("01:00:01", timeFormat.format(new Date(3601000)).substring(0, 8));
}
}
