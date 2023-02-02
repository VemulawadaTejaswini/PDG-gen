//9
public class func{
public void testRead(){
        final StringReader stringReader = new StringReader("hello");
        final JavaCCReader javaccReader = new JavaCCReader(stringReader);
        final BufferedReader reader = new BufferedReader(javaccReader);
        assertEquals("hello", reader.readLine());
}
}
