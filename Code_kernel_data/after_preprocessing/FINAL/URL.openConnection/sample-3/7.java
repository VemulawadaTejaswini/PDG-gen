public class func{
public void contentLength(){
    URL url = getURL();
    if (ResourceUtils.isFileURL(url)) {
      return super.contentLength();
    }
    else {
      URLConnection con = url.openConnection();
      con.setUseCaches(false);
      if (con instanceof HttpURLConnection) {
        ((HttpURLConnection) con).setRequestMethod("HEAD");
      }
      return con.getContentLength();
    }
}
}
