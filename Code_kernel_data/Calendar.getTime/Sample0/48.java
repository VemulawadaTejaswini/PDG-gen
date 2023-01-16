//47
public class func{
	public void testFormat(){
    Calendar cal = Calendar.getInstance();
    cal.set(2011, 9, 1, 14, 30, 24);
    Date toFormat = cal.getTime();
    assertEquals("2011-10-01 14:30:24", format.format(toFormat));
}
}
