//46
public class func{
	public void loadCustomMod(File file,String className){
            URLClassLoader loader = new URLClassLoader(new URL[]{file.toURI().toURL()}, getClass().getClassLoader());
            return loadCustomMod(loader, className);
}
}
