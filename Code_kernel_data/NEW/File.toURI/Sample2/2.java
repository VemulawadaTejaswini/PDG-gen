//1
public class func{
	public void getResource(String resourcePath){
        File file = new File(resourcePath);
        if (file.exists() && file.isFile()) {
            return file.toURI().toURL();
        }
}
}
