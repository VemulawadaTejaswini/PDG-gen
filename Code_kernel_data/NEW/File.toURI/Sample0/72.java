//71
public class func{
	public void addPath(String path){
      url = new File(path).toURI().toURL();
      addURL(url);
      logger.warning("Don't understand path: " + path);
}
}
