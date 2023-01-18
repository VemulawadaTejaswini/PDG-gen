//30
public class func{
	public void setTargetUriOptions(URI targetUri){
            throw new IllegalArgumentException(String.format(URI_SCHEME, targetUri.toString()));
        if(targetUri.getFragment() != null)
            throw new IllegalArgumentException(String.format(URI_FRAGMENT, targetUri.toString()));
        if(!(OptionValue.isDefaultValue(OptionValue.Name.URI_HOST, targetUri.getHost().getBytes(CoapMessage.CHARSET))))
            addUriHostOption(targetUri.getHost());
        if(targetUri.getPort() != -1 && targetUri.getPort() != OptionValue.URI_PORT_DEFAULT)
            addUriPortOption(targetUri.getPort());
        addUriPathOptions(targetUri.getPath());
        addUriQueryOptions(targetUri.getQuery());
}
}
