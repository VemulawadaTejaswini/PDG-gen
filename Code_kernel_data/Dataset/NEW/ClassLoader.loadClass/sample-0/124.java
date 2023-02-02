//124
public class func{
public void callSendSystemOutAndErrToSLF4JInClassLoader(ClassLoader classLoader){
        Class<?> sysOutOverSLF4JClass = classLoader.loadClass(SysOutOverSLF4J.class.getName());
}
}
