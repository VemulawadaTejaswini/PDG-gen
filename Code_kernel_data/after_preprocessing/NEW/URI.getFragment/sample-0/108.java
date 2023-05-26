//108
public class func{
public void assertDecoded(String decoded,String original){
        assertEquals(decoded, new URI("http://foo#" + original).getFragment());
        assertEquals(decoded, URLDecoder.decode(original));
        assertEquals(decoded, URLDecoder.decode(original, "UTF-8"));
}
}
