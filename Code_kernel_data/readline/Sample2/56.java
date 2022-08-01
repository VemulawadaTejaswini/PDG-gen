//55
public class func{
	public void testCreate(){
    BufferedReader reader = factory.create(new ByteArrayResource("a\nb\nc".getBytes()), "UTF-8");
    assertEquals("a", reader.readLine());
}
}
