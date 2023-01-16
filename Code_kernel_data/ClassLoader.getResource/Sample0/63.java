//62
public class func{
	public void getIcon(String iconResource){
    ClassLoader cl = getClassLoaderForResources();
    URL iconUrl = cl.getResource(iconResource);
    if (iconUrl == null)
      return null;
    return new IconUIResource(new ImageIcon(iconUrl));
}
}
