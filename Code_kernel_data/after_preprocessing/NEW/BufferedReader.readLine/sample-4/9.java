//9
public class func{
public void test_readLine_interaction_with_skip(){
        BufferedReader r = new BufferedReader(new StringReader("1\r\n2"));
        assertEquals(2, r.skip(2));
        assertEquals("", r.readLine()); // The '\r' we skip()ed didn't count.
        assertEquals("2", r.readLine());
        assertNull(r.readLine());
}
}
