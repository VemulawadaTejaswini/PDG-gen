public class func{
public void testUri(final String input){
        assertEquals(originalUri.getFragment(), uri.getFragment());
        assertEquals(originalUri.getRawSchemeSpecificPart(), uri.getRawSchemeSpecificPart());
}
}
