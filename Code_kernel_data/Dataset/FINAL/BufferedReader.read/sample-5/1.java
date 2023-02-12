public class func{
public void test_markI(){
        BufferedReader br = new BufferedReader(new StringReader("01234"), 2);
        br.mark(3);
        int result = br.read(carray);
        assertEquals("Assert 2:", '2', carray[2]);
        assertEquals("Assert 3:", '3', br.read());
        br = new BufferedReader(new StringReader("01234"), 2);
        br.mark(3);
        result = br.read(carray);
        assertEquals("Assert 8:", '3', carray[3]);
        assertEquals("Assert 9:", '4', br.read());
        assertEquals("Assert 10:", -1, br.read());
        BufferedReader reader = new BufferedReader(new StringReader("01234"));
        reader.mark(Integer.MAX_VALUE);
        reader.read();
        reader.close();
}
}
