//55
public class func{
	public void createFullURI(URI uri){
        return new URI(
                scheme, authority, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
