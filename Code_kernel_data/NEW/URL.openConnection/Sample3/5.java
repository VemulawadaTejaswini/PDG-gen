//4
public class func{
	public void outputStreamFromURL(URL url){
        if ("file".equals(url.getProtocol())) {
            // as with inputStreamFromURL, avoid probs with Windows network mounts:
            String host = url.getHost();
            if (host == null || host.length() == 0) {
                return new FileOutputStream(url.getPath());
            }
        }
        return url.openConnection().getOutputStream();
}
}
