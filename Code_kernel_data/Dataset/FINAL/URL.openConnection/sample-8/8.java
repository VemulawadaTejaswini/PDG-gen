public class func{
public void getLastModifiedTime(URL url){
      urlConnection = url.openConnection();
      return urlConnection.getLastModified();
      if (urlConnection != null) {
        try {
          InputStream inputStream = urlConnection.getInputStream();
          inputStream.close();
        }
        catch (IOException ioe) {
        }
      }
}
}
