//1
public class func{
	public void test_readLine_all_line_endings(){
        BufferedReader r = new BufferedReader(new StringReader("1\r2\n3\r\n4"));
        assertEquals("1", r.readLine());
        assertEquals("2", r.readLine());
        assertEquals("3", r.readLine());
        assertEquals("4", r.readLine());
        assertNull(r.readLine());
}
}
