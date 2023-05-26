public class func{
public void testUrlFactory(){
        URL url = UrlFactory.getUrl("https:
        Assert.assertEquals(HttpsUrlHandler.HTTPS, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof HttpUrlConnection);
        url = UrlFactory.getUrl("HTTP:
        Assert.assertEquals(HttpUrlHandler.HTTP, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof HttpUrlConnection);
        url = UrlFactory.getUrl("sftp:
        Assert.assertEquals(SftpUrlHandler.PROTOCOL, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof SftpUrlConnection);
        url = UrlFactory.getUrl("sftp.3GPP:
        Assert.assertEquals(Sftp3gppUrlHandler.PROTOCOL, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof Sftp3gppUrlConnection);
}
}
