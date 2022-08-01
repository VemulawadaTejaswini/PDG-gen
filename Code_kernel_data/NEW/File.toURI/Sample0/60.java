//59
public class func{
	public void url_$_is_opened(String s){
        File file = new File( targetReportDir, "index.html" );
        String url = file.toURI().toURL().toString() + s;
        webDriver.get( url );
}
}
