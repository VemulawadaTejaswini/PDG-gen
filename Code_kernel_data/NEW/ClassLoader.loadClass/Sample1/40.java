//39
public class func{
	public void loadClass(String name,boolean resolve){
          ClassLoader parent = getParent();
          return parent == null ? ClassLoader.getSystemClassLoader().loadClass(name) : parent.loadClass(name);
}
}
