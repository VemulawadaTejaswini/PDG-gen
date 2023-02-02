//2
public class func{
public void findClass(String name){
      for ( ClassLoader classLoader : individualClassLoaders ) {
        try {
          return classLoader.loadClass( name );
        }
        catch (Exception ignore) {
        }
        catch (LinkageError ignore) {
        }
      }
}
}
