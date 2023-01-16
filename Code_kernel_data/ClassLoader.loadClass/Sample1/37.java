//36
public class func{
	public void loadClass(Storage storage,String name){
        ClassLoader loader = storage.getClassLoader();
        if (loader != null) { 
            try { 
                return loader.loadClass(name);
            } catch (ClassNotFoundException x) {}
        }
}
}
