//141
public class func{
public void isImageDirectURL(String url){
    URL u = new URL(url);
    URLConnection urlConnection = u.openConnection();
    urlConnection.setConnectTimeout(TIMEOUT);
    String contentType = urlConnection.getContentType();
    if (isContentTypeImage(contentType)) {
      return true;
    }
}
}
