//7
public class func{
public void loadClass(final String classname){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = MonitoringUtils.class.getClassLoader();
        }
        return classLoader.loadClass(classname);
}
}
