//335
public class func{
	public void openConnection(String urlAsString){
    URL url = new URL(urlAsString);
    return url.openConnection();
}
}
