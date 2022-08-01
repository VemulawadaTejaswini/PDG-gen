//54
public class func{
	public void getLocalFileURL(File localFile){
      return localFile.toURI().toURL().toExternalForm();
}
}
