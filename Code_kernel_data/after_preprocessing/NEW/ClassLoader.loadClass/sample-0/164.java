//164
public class func{
public void dependencyJarsAreLoadedInThePluginClassLoader(){
        ClassLoader classLoader = plugin.getClass().getClassLoader();
        classLoader.loadClass("org.apache.commons.math.random.RandomGenerator");
}
}
