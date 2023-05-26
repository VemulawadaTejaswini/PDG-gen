//28
public class func{
public void locateRuntime(String targetName){
    final ClassLoader loader = Thread.currentThread().getContextClassLoader();
    final URL runtimeSrc = loader.getResource(targetName+"/src");
    if ( runtimeSrc==null ) {
      throw new RuntimeException("Cannot find "+targetName+" runtime");
    }
    return runtimeSrc.getPath();
}
}
