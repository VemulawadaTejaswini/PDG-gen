public class func{
public void loadTomcatPackage(ClassLoader loader){
        Class<?> clazz = loader.loadClass(
                basePackage + "util.http.FastHttpDateFormat");
        clazz.newInstance();
}
}
