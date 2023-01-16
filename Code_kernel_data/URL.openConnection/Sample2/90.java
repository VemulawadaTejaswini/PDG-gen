//89
public class func{
	public void sendResource(final WebScriptRequest request,final WebScriptResponse response,final URL resource){
    final String contentType = getContentType(resource);
    response.setContentType(contentType);
    response.setContentEncoding(getContentEncoding(resource));
    final URLConnection connection = resource.openConnection();
}
}
