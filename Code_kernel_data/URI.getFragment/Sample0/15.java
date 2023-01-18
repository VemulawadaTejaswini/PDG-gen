//14
public class func{
	public void rewriteUrlIfNeeded(String value){
            if (value.startsWith(this.serverProto.concat("://")))
            {
  
                uri = new URI (value);
            }
            else
            {
                URL url = new URL(this.requestURL, value);
                uri = url.toURI();
            }
            String actualProto = uri.getScheme();
            if (!this.serverProto.equalsIgnoreCase(actualProto))
            {
                // protocol is already correct
                return null;
            }
            if (!this.serverName.equals(uri.getHost()))
            {
                // going to a different host
                return null;
            }
            if (normalizePort(this.serverProto, this.serverPort) != normalizePort(actualProto, uri.getPort()))
            {
                // not to default port
                return null;
            }
            return new URI(this.clientProto,null, this.serverName, this.clientPort, uri.getPath(),uri.getQuery(),uri.getFragment()).toURL();
}
}
