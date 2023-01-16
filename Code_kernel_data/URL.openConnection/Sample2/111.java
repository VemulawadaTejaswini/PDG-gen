//110
public class func{
	public void makeRequest(URL source,String cookie){
      JConfig.log().logDebug("makeRequest: " + source.toString());
    URLConnection uc = source.openConnection();
    setConnectionInfo(uc);
}
}
