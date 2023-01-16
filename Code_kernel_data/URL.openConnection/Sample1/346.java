//345
public class func{
	public void testInvalidAttachmentJarURL(){
        URL url = new URL(null, "http://invalid/url", (URLStreamHandler) this.handler);
            url.openConnection();
}
}
