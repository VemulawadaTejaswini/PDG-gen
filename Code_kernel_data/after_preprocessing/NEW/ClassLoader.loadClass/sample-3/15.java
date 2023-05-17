//15
public class func{
public void newInstance(String fqcn,ClassLoader classLoader){
        Class<?> clazz = classLoader.loadClass(fqcn);
        return prepareInstance(clazz.newInstance());
}
}
