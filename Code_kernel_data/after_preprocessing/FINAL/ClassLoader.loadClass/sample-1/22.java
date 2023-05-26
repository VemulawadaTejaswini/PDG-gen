public class func{
public void loadClass(ClassLoader classLoader,String className){
        Class cls = primitivesMap.get( className );
        if ( cls == null ) {
            cls = classLoader.loadClass( className );
        }
}
}
