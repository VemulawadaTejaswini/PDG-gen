public class func{
public void processClass(String className){
        Class<?> inst = classLoader.loadClass(GAletteInstrumentation.class.getName());
        Method processFile = inst.getMethod("processFile", new Class[]{File.class});
}
}
