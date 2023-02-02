//162
public class func{
	public void test_read(){
        assertTrue(new BufferedReader(new CharArrayReader(new char[5], 1, 0), 2).read() == -1);
}
}
