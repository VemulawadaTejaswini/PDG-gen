//22
public class func{
public void buildURI(NodeId nodeId,URI baseUri){
        return new URI(
                baseUri.getScheme(),
                baseUri.getUserInfo(),
                baseUri.getHost(),
                baseUri.getPort(),
                baseUri.getPath(),
                isNullOrEmpty(baseUri.getQuery()) ? queryParams : baseUri.getQuery() + "&" + queryParams,
                baseUri.getFragment()
        );
}
}
