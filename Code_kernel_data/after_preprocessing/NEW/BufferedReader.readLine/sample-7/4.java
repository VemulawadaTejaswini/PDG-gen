//4
public class func{
public void test_readLine_interaction_with_array_read_2(){
        BufferedReader r = new BufferedReader(new StringReader("1\r\n2"));
        assertEquals("1", r.readLine());
        assertEquals(1, r.read(chars, 0, 1)); // This read skips the '\n'.
        assertEquals('2', chars[0]);
        assertNull(r.readLine());
}
}
