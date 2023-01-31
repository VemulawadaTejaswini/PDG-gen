//2
public class func{
	public void testUrlFactory(){
        URL url = UrlFactory.getUrl("https://www.google.com", null);
        Assert.assertEquals(HttpsUrlHandler.HTTPS, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof HttpUrlConnection);
        url = UrlFactory.getUrl("HTTP://www.opennms.org", null);
        Assert.assertEquals(HttpUrlHandler.HTTP, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof HttpUrlConnection);
        url = UrlFactory.getUrl("sftp://www.opennms.org", null);
        Assert.assertEquals(SftpUrlHandler.PROTOCOL, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof SftpUrlConnection);
        url = UrlFactory.getUrl("sftp.3GPP://junier-router.local/opt/3gpp/data", null);
        Assert.assertEquals(Sftp3gppUrlHandler.PROTOCOL, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof Sftp3gppUrlConnection);
}
}
