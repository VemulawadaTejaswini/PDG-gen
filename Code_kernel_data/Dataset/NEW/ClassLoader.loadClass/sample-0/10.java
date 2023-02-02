//10
public class func{
public void loadClass(final ClassName className){
        String cn = getClassName(className.toString());
            return classLoader.loadClass(cn);
            throw new PicoClassNotFoundException(cn, e);
}
}
