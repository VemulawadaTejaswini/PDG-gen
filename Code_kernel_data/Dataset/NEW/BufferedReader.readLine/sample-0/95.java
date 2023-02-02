//95
public class func{
public void testCheckForBomNoBom(){
    ByteArrayInputStream stream = new ByteArrayInputStream("test".getBytes());
    ByteOrderMark bom = PropertiesHelper.checkForBom(stream);
    assertNull(bom);
    BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
    assertEquals("The reader must contain everything after the bom", "test", reader.readLine());
}
}
