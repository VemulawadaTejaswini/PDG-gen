public class func{
public void wire(ClassLoader classLoader,String className,Object invoker){
        final Class clazz = classLoader.loadClass( className );
        if (clazz != null) {
            if (invoker instanceof Wireable) {
                ( (Wireable) invoker ).wire( clazz.newInstance() );
            }
        } else {
            throw new ClassNotFoundException( className );
        }
}
}
