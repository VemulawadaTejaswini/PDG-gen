public class func{
public void assertContent(String expected,Reader source){
    assertNotNull(source);
    final BufferedReader buffer = new BufferedReader(source);
    assertEquals(expected, buffer.readLine());
    assertNull(buffer.readLine());
    buffer.close();
}
}
