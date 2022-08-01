//21
public class func{
	public void loadClass(String className,ClassLoader classLoader){
        if (classLoader == null) {
            return Class.forName(className);
        }
        return classLoader.loadClass(className);
}
}
