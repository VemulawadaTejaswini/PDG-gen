public class func{
public void loadClass(String className,ClassLoader classLoader){
                return (ReferenceWithError<Class<? extends D>>)(ReferenceWithError) ReferenceWithError.newInstanceWithoutError((Class<? extends EntityDriver>)classLoader.loadClass(className));
}
}
