//50
public class func{
	public void assertDatePattern(final String pattern,final int year,final int month,final int day,final int hour,final int min,final String expected){
        assertEquals(expected,
            policy.format(cal.getTime()));
}
}
