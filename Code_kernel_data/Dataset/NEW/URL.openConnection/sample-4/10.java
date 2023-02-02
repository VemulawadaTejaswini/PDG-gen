//10
public class func{
public void contentLength(){
        URL url = getURL();
        if (GrailsResourceUtils.isFileURL(url)) {
            // Proceed with file system resolution...
            return getFile().length();
        }
        URLConnection con = url.openConnection();
        useCachesIfNecessary(con);
        if (con instanceof HttpURLConnection) {
            ((HttpURLConnection) con).setRequestMethod("HEAD");
        }
        return con.getContentLength();
}
}
