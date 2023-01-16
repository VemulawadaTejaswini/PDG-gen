//75
public class func{
	public void create(URI ref){
    return new URIRef(ref.getScheme(),ref.getAuthority(),ref.getPath(),ref.getQuery(),ref.getFragment());
}
}
