//10
public class func{
	public void testBeautify(){
        String res = DefaultRSAPubKey.beautify(longStr);
        BufferedReader sbuf = new BufferedReader(new StringReader(res));
        while ((line = sbuf.readLine()) != null) {
            if (line.length() != 60) {
                assertTrue("only the last line can be less than 60 chars", sbuf.readLine() == null);
            }
        }
}
}
