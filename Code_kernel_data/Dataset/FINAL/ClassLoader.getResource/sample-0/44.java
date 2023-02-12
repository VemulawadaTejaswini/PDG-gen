public class func{
public void getResources(String resName){
              ClassLoader cl = Loader.class.getClassLoader();
              if (cl == null)
                url = ClassLoader.getSystemResource(resName);
              else
                url = cl.getResource(resName);
              return new Singleton(url);
}
}
