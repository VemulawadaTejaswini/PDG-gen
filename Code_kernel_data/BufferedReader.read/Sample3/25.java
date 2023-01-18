//24
public class func{
	public void testAddReferenceTypeInput(){
            while ((charsRead = reader.read(cbuf)) != -1) {
                postText = postText.append(cbuf, 0, charsRead);
            }
            assertTrue(postText.toString().contains("wps:Reference"));
            assertFalse(true);
}
}
