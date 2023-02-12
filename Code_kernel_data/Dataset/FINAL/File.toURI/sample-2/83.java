public class func{
public void loadJar(File file){
            method.invoke(ClassLoader.getSystemClassLoader(), new Object[]{file.toURI().toURL()});
}
}
