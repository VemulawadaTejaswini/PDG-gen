//21
public class func{
public void getInputStream(String fileName){
    URL url = servletContext.getResource(resourcesDir.concat(fileName));
    if (url == null) {
      return null;
    }
    URLConnection urlConnection = url.openConnection();
    return urlConnection.getInputStream();
}
}
