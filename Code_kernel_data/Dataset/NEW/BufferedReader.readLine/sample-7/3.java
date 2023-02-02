//3
public class func{
public void test_readLine_interaction_with_read(){
        BufferedReader r = new BufferedReader(new StringReader("1\r\n2"));
        assertEquals('1', r.read());
        assertEquals('\r', r.read());
        assertEquals("", r.readLine()); // The '\r' we read() didn't count.
        assertEquals("2", r.readLine());
        assertNull(r.readLine());
}
}
