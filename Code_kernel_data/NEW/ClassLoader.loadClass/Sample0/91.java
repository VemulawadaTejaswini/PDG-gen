//90
public class func{
	public void newInstance(final String fqcn,final ClassLoader classLoader){
        return newInstance(classLoader.loadClass(fqcn));
}
}
