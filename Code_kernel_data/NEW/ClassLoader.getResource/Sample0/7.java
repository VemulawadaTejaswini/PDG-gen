//6
public class func{
	public void findResource(String name){
    for (ClassLoader delegate : delegateClassLoaders) {
      resource = delegate.getResource(name);
      if (resource != null)
        break;
    }
}
}
