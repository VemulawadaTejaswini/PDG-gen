//11
public class func{
	public void getInputStream(String path){
            URL url = getResource(path);
            if (url == null) {
                return null;
            }
            URLConnection connection = url.openConnection();
            connection.setUseCaches(false);
            return connection.getInputStream();
}
}
