public class func{
public void assertContent(Reader source){
    assertNotNull(source);
    final BufferedReader buffer = new BufferedReader(source);
    assertEquals("Source", buffer.readLine());
    assertNull(buffer.readLine());
    buffer.close();
}
}
