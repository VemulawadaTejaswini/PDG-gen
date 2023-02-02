//82
public class func{
public void loadPluginClass(ClassLoader classLoader){
        String pluginClassName = pluginPropertiesReader.getPluginClassName(classLoader);
        logger.info("Loading plugin class {}", pluginClassName);
            return (Class<? extends Plugin>) classLoader.loadClass(pluginClassName);
}
}
