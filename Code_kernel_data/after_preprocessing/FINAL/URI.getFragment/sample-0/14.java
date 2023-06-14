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
                return null;
            }
            if (!this.serverName.equals(uri.getHost()))
            {
                return null;
            }
            if (normalizePort(this.serverProto, this.serverPort) != normalizePort(actualProto, uri.getPort()))
            {
                return null;
            }
            return new URI(this.clientProto,null, this.serverName, this.clientPort, uri.getPath(),uri.getQuery(),uri.getFragment()).toURL();
}
}
