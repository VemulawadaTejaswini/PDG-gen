public class func{
public void invokeMain(ClassLoader classloader,String classname,String[] args){
        Class<?> invoked_class = classloader.loadClass(classname);
}
}
