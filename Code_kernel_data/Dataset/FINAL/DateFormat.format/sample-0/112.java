public class func{
public void test8(){
    Date jul4 = new Date(12603L * 86400000L);
    assertEquals("2004-07-04 00:00:00,000", cachedFormat.format(jul4));
}
}
