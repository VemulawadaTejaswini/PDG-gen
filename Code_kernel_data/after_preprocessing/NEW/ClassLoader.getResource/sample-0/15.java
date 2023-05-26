//15
public class func{
public void getResource(String name){
    for(ClassLoader classLoader : _classLoaders)
    {
      url = classLoader.getResource(name);

      if(url != null)
        return url;
    }
}
}
