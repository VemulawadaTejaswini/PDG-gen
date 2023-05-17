public class func{
public void toHttp(final URI inputUri){
        Objects.requireNonNull(inputUri,"Input URI must not be null");
        String wsScheme = inputUri.getScheme();
        if ("http".equalsIgnoreCase(wsScheme) || "https".equalsIgnoreCase(wsScheme))
        {
            httpScheme = wsScheme;
        }
        else if ("ws".equalsIgnoreCase(wsScheme))
        {
            httpScheme = "http";
        }
        else if ("wss".equalsIgnoreCase(wsScheme))
        {
            httpScheme = "https";
        }
        else
        {
            throw new URISyntaxException(inputUri.toString(),"Unrecognized WebSocket scheme");
        }
        return new URI(httpScheme,inputUri.getUserInfo(),inputUri.getHost(),inputUri.getPort(),inputUri.getPath(),inputUri.getQuery(),inputUri.getFragment());
}
}
