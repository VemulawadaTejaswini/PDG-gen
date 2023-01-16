//31
public class func{
	public void test_getContentLength(){
        URL u = copyAndOpenResourceStream("lf.jar", "");
        assertEquals("Returned incorrect size for jar file", 33095,
                u.openConnection().getContentLength());
        u = copyAndOpenResourceStream("lf.jar", "plus.bmp");
        assertEquals("Returned incorrect size for the entry", 190,
                u.openConnection().getContentLength());
}
}
