public class func{
public void newActivity(ClassLoader cl,String className,Intent intent){
        return (Activity) cl.loadClass(className)
                            .newInstance();
}
}
