//255
public class func{
public void testWebProxyResources(){
        URL url = new URL(baseURL);
        URLConnection conn = url.openConnection(proxy);
        Object content = conn.getContent();
        String actualProxy = IOUtils.toString((InputStream) content);
        assertThat(actualProxy, is(expect));
        assertThat(wpr.getCount(), is(1));
}
}
