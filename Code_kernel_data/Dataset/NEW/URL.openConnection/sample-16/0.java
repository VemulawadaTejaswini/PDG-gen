//0
public class func{
public void testMemoryBufferURLConnection(){
        new Random().nextBytes(randomData);
        URL url = MemoryBufferURLConnection.createURL(randomData, CONTENT_TYPE);
        URLConnection uc = url.openConnection();
        uc.connect();
        Assert.assertEquals(CONTENT_TYPE, uc.getContentType());
        Assert.assertEquals(4096, uc.getContentLength());
}
}
