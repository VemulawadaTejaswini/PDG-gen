//92
public class func{
public void compareURIs(URI uri1,URI uri2){
        assertEquals("Unexpected path", uri1.getPath(), uri2.getPath());
        assertEquals("Unexpected fragment", uri1.getFragment(), uri2.getFragment());
}
}
