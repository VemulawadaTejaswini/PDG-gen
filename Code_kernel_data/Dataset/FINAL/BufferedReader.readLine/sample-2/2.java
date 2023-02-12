public class func{
public void testCreateWithLineEnding(){
    BufferedReader reader = factory.create(new ByteArrayResource("a||b".getBytes()), "UTF-8");
    assertEquals("a", reader.readLine());
    assertEquals("b", reader.readLine());
    assertEquals(null, reader.readLine());
}
}
