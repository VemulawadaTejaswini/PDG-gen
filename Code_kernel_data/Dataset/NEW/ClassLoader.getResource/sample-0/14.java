//14
public class func{
public void apply(String resource){
      for (ClassLoader loader : classLoaders) {
        if (loader.getResource(resource) != null) {
          loaderForResource = loader;
        }
      }
      return new InternalResourceFile(resource, loaderForResource);
}
}
