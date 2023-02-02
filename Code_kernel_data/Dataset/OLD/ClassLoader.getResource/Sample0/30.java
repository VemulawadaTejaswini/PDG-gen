//29
public class func{
	public void locateRuntime(){
    final ClassLoader loader = Thread.currentThread().getContextClassLoader();
    final URL runtimeSrc = loader.getResource("JavaScript/src");
    if ( runtimeSrc==null ) {
      throw new RuntimeException("Cannot find JavaScript runtime");
    }
    return runtimeSrc.getPath();
}
}
