//39
public class func{
	public void getWSDLURL(String location){
        if (location.startsWith("http://")) {
            return new URL(location);
        } else {
            return new File(getAbsolutePath(location)).toURI().toURL();
        }
}
}
