public class func{
public void testUrl(){
      URI uri = new URI("sword://StrongsRealGreek/01909");
      assertEquals("sword", uri.getScheme());
      assertEquals("StrongsRealGreek", uri.getHost());
      assertEquals("/01909", uri.getPath());
      assertEquals("/01909", uri.getRawPath());
      assertEquals(null, uri.getQuery());
      assertEquals(null, uri.getFragment());
}
}
