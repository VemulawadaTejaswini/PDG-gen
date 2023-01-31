//131
public class func{
	public void shouldOutputCorrectFormat(){
            then.setTimeZone(TimeZone.getTimeZone("GMT"));
            then.set(1994, 10, 6, 8, 49, 37);
            assertEquals("Date format did not match expected", expected, new HttpDate(then.getTime()).toRFC1123());
}
}
