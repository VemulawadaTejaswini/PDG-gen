//7
public class func{
public void test8(){
    cachedFormat.setTimeZone(TimeZone.getTimeZone("GMT-6"));
    assertEquals("2004-07-03 18:00:00,000", cachedFormat.format(jul4));
}
}
