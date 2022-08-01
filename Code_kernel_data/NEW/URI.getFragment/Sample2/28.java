//27
public class func{
	public void toWebsocket(final URI inputUri){
        Objects.requireNonNull(inputUri,"Input URI must not be null");
        String httpScheme = inputUri.getScheme();
        if ("ws".equalsIgnoreCase(httpScheme) || "wss".equalsIgnoreCase(httpScheme))
        {
            // keep as-is
            wsScheme = httpScheme;
        }
        else if ("http".equalsIgnoreCase(httpScheme))
        {
            // convert to ws
            wsScheme = "ws";
        }
        else if ("https".equalsIgnoreCase(httpScheme))
        {
            // convert to wss
            wsScheme = "wss";
        }
        else
        {
            throw new URISyntaxException(inputUri.toString(),"Unrecognized HTTP scheme");
        }
        return new URI(wsScheme,inputUri.getUserInfo(),inputUri.getHost(),inputUri.getPort(),inputUri.getPath(),inputUri.getQuery(),inputUri.getFragment());
}
}
