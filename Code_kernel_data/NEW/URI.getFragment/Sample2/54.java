//53
public class func{
	public void checkContextForDifferentHostNamesRequests(){
    URI uri2 = new URI(uri1.getScheme(), uri1.getUserInfo(), "127.0.0.1", uri1.getPort(), uri1.getPath(), uri1.getQuery(), uri1.getFragment());
    HttpGet get2 = new HttpGet(uri2);
}
}
