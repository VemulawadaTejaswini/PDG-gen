//12
public class func{
public void testProxiesSeleniumStaticResourcesWithUpstreamProxy(){
        target.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", port)));
    TrustEverythingSSLTrustManager.trustAllSSLCertificates((HttpsURLConnection) client);
    assertTrue(getResponseAsString(client).contains("<body>"));
}
}
