//65
public class func{
	public void TestResource(ClassLoader classLoader,String httpUrl){
    URI uri = new URI(httpUrl);
    if (uri.getPath() == null) {
      throw new IllegalArgumentException("Wrong path in uri:" + httpUrl);
    }
    this.resourceUrl = classLoader.getResource(uri.getPath().substring(1));
}
}
