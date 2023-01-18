//101
public class func{
	public void getCacheContent(String cache_uri){
    URL url = new URL(cache_uri);
    URLConnection uc = url.openConnection();
    return new Scanner(uc.getInputStream()). useDelimiter("\\Z").next();
}
}
