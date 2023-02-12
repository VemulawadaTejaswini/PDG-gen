public class func{
public void navigate(final URL url){
      EncogLogging.log(EncogLogging.LEVEL_INFO, 
          "Navigating to page:" + url);
      final URLConnection connection = url.openConnection();
      final InputStream is = connection.getInputStream();
      navigate(url, is);
      is.close();
}
}
