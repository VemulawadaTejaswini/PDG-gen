//53
public class func{
	public void check(Object content){
                                 InputStream stream = (InputStream)content;
                                 BufferedReader data = new BufferedReader(new InputStreamReader(stream));
                                 assertEquals(CONTENT_STRING, data.readLine());
                                 assertEquals(-1, data.read());
                                 data.close();
}
}
