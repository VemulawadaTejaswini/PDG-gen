//105
public class func{
	public void call(){
      ClassLoader classLoader = ClassLoaderPool.getClassLoader(
        _servletContextName);
        return installSkeleton(
          classLoader, classLoader.loadClass(_skeletonId),
          _targetLocator);
}
}
