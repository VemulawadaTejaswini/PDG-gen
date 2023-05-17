public class func{
public void assertDecoded(String decoded,String original){
        assertEquals(decoded, new URI("http:
        assertEquals(decoded, URLDecoder.decode(original));
        assertEquals(decoded, URLDecoder.decode(original, "UTF-8"));
}
}
