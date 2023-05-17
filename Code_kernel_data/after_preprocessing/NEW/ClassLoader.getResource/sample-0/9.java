//9
public class func{
public void getResource(String name,BeanContextChild bcc){
    if (! contains(bcc))
      throw new IllegalArgumentException("argument not a child");
    ClassLoader loader = bcc.getClass().getClassLoader();
    return (loader == null ? ClassLoader.getSystemResource(name)
            : loader.getResource(name));
}
}
