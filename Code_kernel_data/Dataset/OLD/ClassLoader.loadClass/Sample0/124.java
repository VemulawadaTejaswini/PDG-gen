//123
public class func{
	public void createPlugin(String classNameCheck,String pluginName){
            ClassLoader loader = VMPluginFactory.class.getClassLoader();
            return (VMPlugin) loader.loadClass(pluginName).newInstance();
}
}
