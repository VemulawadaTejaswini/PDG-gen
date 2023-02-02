//5
public class func{
public void createHttpReader(@NotNull URL url){
    httpConfigurable.prepareURL(url.toString());
    URLConnection urlConnection = url.openConnection();
    String contentEncoding = urlConnection.getContentEncoding();
    InputStream inputStream = urlConnection.getInputStream();
    InputStreamReader inputStreamReader = contentEncoding != null
      ? new InputStreamReader(inputStream, contentEncoding)
      : new InputStreamReader(inputStream);
    return new BufferedReader(inputStreamReader);
}
}
