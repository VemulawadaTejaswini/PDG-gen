//6
public class func{
	public void lastModified(){
    URL url = getURL();
    if (ResourceUtils.isFileURL(url) || ResourceUtils.isJarURL(url)) {
      // Proceed with file system resolution...
      return super.lastModified();
    }
    else {
      // Try a URL connection last-modified header...
      URLConnection con = url.openConnection();
      con.setUseCaches(false);
      if (con instanceof HttpURLConnection) {
        ((HttpURLConnection) con).setRequestMethod("HEAD");
      }
      return con.getLastModified();
    }
}
}
