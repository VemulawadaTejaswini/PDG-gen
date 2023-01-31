//77
public class func{
	public void testPrefix(BufferedReader b,String pfx){
            int c = b.read();
            if (c < 0) {
                rv = -1;
                break;
            } else if (c != pfx.charAt(i)) {
                rv = 0;
                break;
            } else {
                rv = 1;
            }
        b.reset();
}
}
