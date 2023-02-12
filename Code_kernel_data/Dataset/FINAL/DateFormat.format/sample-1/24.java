public class func{
public void assertEquals(java.util.Date expected,java.util.Date actual){
            SimpleTimeZone gmt = new SimpleTimeZone(0, "Z");
            df.setTimeZone(gmt);
            fail("Expected: " + df.format(expected) + " actual: " + df.format(actual));
}
}
