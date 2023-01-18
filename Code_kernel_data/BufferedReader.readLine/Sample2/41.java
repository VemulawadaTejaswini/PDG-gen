//40
public class func{
	public void testCreateWithLineEndingAtEnd(){
    BufferedReader reader = factory.create(new ByteArrayResource("a||".getBytes()), "UTF-8");
    assertEquals("a", reader.readLine());
    assertEquals(null, reader.readLine());
}
}
