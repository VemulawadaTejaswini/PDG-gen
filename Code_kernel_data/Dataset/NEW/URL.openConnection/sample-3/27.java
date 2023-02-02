//27
public class func{
public void contentLength(){
        URL url = getURL();
        if (ResourceUtils.isFileURL(url)) {
            // Proceed with file system resolution...
            return getFile().length();
        } else {
            // Try a URL connection content-length header...
            URLConnection con = url.openConnection();
            customizeConnection(con);
            return con.getContentLength();
        }
}
}
