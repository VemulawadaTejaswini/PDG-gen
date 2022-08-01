//78
public class func{
	public void assertFormattedTime(Date date,TimeZone timeZone,String expected){
    DateFormat formatter = createAbsoluteTimeDateFormat(timeZone);
    String actual = formatter.format(date);
    assertEquals(expected, actual);
}
}
