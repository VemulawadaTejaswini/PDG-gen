//56
public class func{
	public void getWorkingDirectory(){
      File file = new File(System.getProperty("user.dir"));
      return file.toURI().toURL();
}
}
