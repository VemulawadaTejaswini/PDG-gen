//92
public class func{
public void Jdk6JavaProcessManager(ClassLoader classLoader){
        Validate.notNull( classLoader, "ClassLoader can't be NULL" );
        Class<?> originalClass = classLoader.loadClass( LocalVirtualMachine.ORIGINAL_CLASS_NAME );
        staticVm = WeakCastUtils.staticCast( originalClass, StaticLocalVirtualMachine.class );
}
}
