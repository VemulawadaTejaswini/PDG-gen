public class func{
public void lastModified(){
    URL url = getURL();
    if (ResourceUtils.isFileURL(url) || ResourceUtils.isJarURL(url)) {
      return super.lastModified();
    }
    else {
      URLConnection con = url.openConnection();
      con.setUseCaches(false);
      if (con instanceof HttpURLConnection) {
        ((HttpURLConnection) con).setRequestMethod("HEAD");
      }
      return con.getLastModified();
    }
}
}
