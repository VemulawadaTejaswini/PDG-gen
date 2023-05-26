public class func{
public void toWebsocket(final URI inputUri){
        Objects.requireNonNull(inputUri,"Input URI must not be null");
        String httpScheme = inputUri.getScheme();
        if ("ws".equalsIgnoreCase(httpScheme) || "wss".equalsIgnoreCase(httpScheme))
        {
            wsScheme = httpScheme;
        }
        else if ("http".equalsIgnoreCase(httpScheme))
        {
            wsScheme = "ws";
        }
        else if ("https".equalsIgnoreCase(httpScheme))
        {
            wsScheme = "wss";
        }
        else
        {
            throw new URISyntaxException(inputUri.toString(),"Unrecognized HTTP scheme");
        }
        return new URI(wsScheme,inputUri.getUserInfo(),inputUri.getHost(),inputUri.getPort(),inputUri.getPath(),inputUri.getQuery(),inputUri.getFragment());
}
}
