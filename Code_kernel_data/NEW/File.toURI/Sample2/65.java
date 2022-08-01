//64
public class func{
	public void handleAsFile(File file){
            handleAsURL(file.toURI().toURL());
            throw illegalValue(file, URL.class, e);
}
}
