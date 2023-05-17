//7
public class func{
public void contentLength(){
    URL url = getURL();
    if (ResourceUtils.isFileURL(url)) {
      // Proceed with file system resolution...
      return super.contentLength();
    }
    else {
      // Try a URL connection content-length header...
      URLConnection con = url.openConnection();
      con.setUseCaches(false);
      if (con instanceof HttpURLConnection) {
        ((HttpURLConnection) con).setRequestMethod("HEAD");
      }
      return con.getContentLength();
    }
}
}
