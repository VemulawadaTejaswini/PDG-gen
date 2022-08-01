//9
public class func{
	public void lastModified(){
        URL url = getURL();
        if (GrailsResourceUtils.isFileURL(url) || GrailsResourceUtils.isJarURL(url)) {
            // Proceed with file system resolution...
            return getFile().lastModified();
        }
        URLConnection con = url.openConnection();
        useCachesIfNecessary(con);
        if (con instanceof HttpURLConnection) {
            ((HttpURLConnection) con).setRequestMethod("HEAD");
        }
        return con.getLastModified();
}
}
