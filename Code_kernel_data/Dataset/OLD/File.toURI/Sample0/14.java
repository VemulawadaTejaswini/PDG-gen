//13
public class func{
	public void addClassPath(String path){
    if (path != null) {
      URL url = new File(path).toURI().toURL();
      URL[] urls = new URL[appClassPath.length + 1];
      System.arraycopy(appClassPath, 0, urls, 0, appClassPath.length);
      urls[appClassPath.length] = url;
      appClassPath = urls;
    }
}
}
