//0
public class func{
public void initMain(){
        ClassLoader antClassloader = new URLClassLoader(antJarUrls, ClassLoader.getSystemClassLoader().getParent());
        Class<?> antMain = antClassloader.loadClass("org.apache.tools.ant.Main");
        mainMethod = antMain.getMethod("main", String[].class);
}
}
