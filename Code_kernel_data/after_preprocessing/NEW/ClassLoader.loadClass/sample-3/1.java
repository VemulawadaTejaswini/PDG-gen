//1
public class func{
public void createWrappedInstance(){
      ClassLoader cl = Main.createShadowClassLoader();
        Class<?> mc = cl.loadClass("lombok.core.AnnotationProcessor");
        return (AbstractProcessor) mc.newInstance();
}
}
