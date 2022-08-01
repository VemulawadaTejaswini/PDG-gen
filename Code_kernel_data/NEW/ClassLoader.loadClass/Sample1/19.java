//18
public class func{
	public void relFindClass(Class home,String name){
            ClassLoader loader = home.getClassLoader();
            if (loader != null)
                return loader.loadClass(name);
            else
                return Class.forName(name);
}
}
