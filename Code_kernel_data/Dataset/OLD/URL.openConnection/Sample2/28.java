//27
public class func{
	public void openConnection(URL scriptURL){
        URLConnection urlConnection = scriptURL.openConnection();
        verifyInputStream(urlConnection);
        return scriptURL.openConnection();
}
}
