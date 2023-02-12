public class func{
public void getUrlForPath(String path){
        ClassLoader classLoader = HttpServerHandler.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResource(path);
        } else {
            return classLoader.getResource(path);
        }
}
}
