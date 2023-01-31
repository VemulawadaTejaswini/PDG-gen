//64
public class func{
	public void testLastModified(){
    assertEquals("Invalid Date header", calendar.getTime(), getDateFromHeader(headers, "last-modified"));
}
}
