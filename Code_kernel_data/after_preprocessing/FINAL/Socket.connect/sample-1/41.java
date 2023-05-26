public class func{
public void testCreateLayeredSocket(){
      @Cleanup Socket plain = new Socket();
      plain.connect(sampleTlsEndpoint);
      assertTrue(plain.isConnected());
}
}
