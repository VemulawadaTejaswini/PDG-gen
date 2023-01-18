//31
public class func{
	public void checkHtmlFile(File file,boolean asUTF8){
        InputSource is = new InputSource(new FileInputStream(file));
        is.setSystemId(file.toURI().toURL().toString());
}
}
