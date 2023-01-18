//114
public class func{
	public void buildUri(URI uri,String additionalPath,String indexName,String login,String apiKey,String additionnalQuery){
    return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(),
        uri.getPort(), path.toString(), query.toString(),
        uri.getFragment());
}
}
