public class func{
public void JDK6ServiceLoader(ClassLoader classLoader){
            Class<?> slc = classLoader.loadClass( "java.util.ServiceLoader" );
            iteratorMethod = slc.getMethod( "iterator" );
}
}
