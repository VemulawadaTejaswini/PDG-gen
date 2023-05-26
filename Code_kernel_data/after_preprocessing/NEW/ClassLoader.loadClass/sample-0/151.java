//151
public class func{
public void loadExtension(String serviceClassName,final ClassLoader loader){
            return (Class<Extension>) loader.loadClass(serviceClassName);
}
}
