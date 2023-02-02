//114
public class func{
public void getInputStreamForUrl(String urlString){
    URL url = new URL(urlString);
    URLConnection urlConnection = url.openConnection();
    urlConnection.setRequestProperty("User-Agent", userAgent);
    return urlConnection.getInputStream();
}
}
