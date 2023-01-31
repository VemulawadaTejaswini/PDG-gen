//38
public class func{
	public void getLastModified(String fileName){
        URL url = Externalization.class.getClassLoader().getResource(fileName);
        if (url != null) {
            URLConnection connection = url.openConnection();
            lastModified = connection.getLastModified();
        }
}
}
