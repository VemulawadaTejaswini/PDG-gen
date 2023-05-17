public class func{
public void loadClass(final ClassLoader classLoader,final String typeName){
                return classLoader.loadClass(typeName);
                throw new PicoClassNotFoundException(typeName, e);
}
}
