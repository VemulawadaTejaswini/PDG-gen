public class func{
public void testProxiesSeleniumStaticResourcesWithUpstreamProxy(){
        target.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", port)));
    assertTrue(getResponseAsString(client).contains("<body>"));
    target = new URL("https:
}
}
