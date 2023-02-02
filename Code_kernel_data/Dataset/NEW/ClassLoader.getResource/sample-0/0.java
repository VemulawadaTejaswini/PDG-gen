//0
public class func{
public void getResourceStreamWithClassLoader(ClassLoader classLoader,String path){
    if (classLoader != null)
    {
      URL url = classLoader.getResource(path);
      if (url != null)
      {
        return new UrlResourceStream(url);
      }
    }
}
}
