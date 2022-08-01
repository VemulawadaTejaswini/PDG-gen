//147
public class func{
	public void PluginClassLoader(ClassLoader parent,File libDir){
        super(new URL[]{libDir.toURI().toURL()}, parent);
}
}
