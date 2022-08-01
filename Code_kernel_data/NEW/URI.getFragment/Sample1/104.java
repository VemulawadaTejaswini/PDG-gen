//103
public class func{
	public void urlExtractFragment(@SqlType(StandardTypes.VARCHAR) Slice url){
        URI uri = parseUrl(url);
        return (uri == null) ? null : slice(uri.getFragment());
}
}
