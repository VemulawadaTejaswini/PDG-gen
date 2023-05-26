//10
public class func{
public void setJspFactory(){
            final ClassLoader classLoader = ParentClassLoaderFinder.Helper.get();
            final Class<?> jspFactoryApi = classLoader.loadClass("javax.servlet.jsp.JspFactory");
            jspFactoryApi.getMethod("setDefaultFactory", jspFactoryApi).invoke(null, jspFactory.newInstance());
}
}
