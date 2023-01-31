//4
public class func{
	public void test_readLine_interaction_with_mark_and_reset(){
        BufferedReader r = new BufferedReader(new StringReader("1\r\n2\n3"));
        assertEquals("1", r.readLine());
        r.mark(256);
        assertEquals('2', r.read()); // This read skips the '\n'.
        assertEquals("", r.readLine());
        r.reset(); // Now we're back half-way through the "\r\n".
        assertEquals("2", r.readLine());
        assertEquals("3", r.readLine());
        assertNull(r.readLine());
}
}
