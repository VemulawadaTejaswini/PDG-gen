//3
public class func{
public void main(String[] args){
    ClassLoader cl = createShadowClassLoader();
    Class<?> mc = cl.loadClass("lombok.core.Main");
      mc.getMethod("main", String[].class).invoke(null, new Object[] {args});
}
}
