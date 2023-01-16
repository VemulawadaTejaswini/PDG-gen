//4
public class func{
	public void getURL(String filename){
      ClassLoader classLoader = getClass().getClassLoader();
      url = classLoader.getResource( filename );
}
}
