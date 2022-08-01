//18
public class func{
	public void resolve(String uri,URIResolver resolver){
        if (parsed.getPath() != null)
            path += parsed.getPath();
        if (parsed.getQuery() != null)
            path += parsed.getQuery();
        if (parsed.getFragment() != null)
            path += "#" + parsed.getFragment();
        int port = parsed.getPort() < 0 ? Address.NULL_PORT : parsed.getPort();
        Address address = new Address(parsed.getScheme(), parsed.getHost(), port);
        return resolver.resolve(address, path);
}
}
