public class func{
public void findClass(String className,Class referencePoint){
            ClassLoader cl = referencePoint.getClassLoader();
            if (cl == null) {
                cl = ClassLoader.getSystemClassLoader();
            }
            return cl.loadClass(className);
}
}
