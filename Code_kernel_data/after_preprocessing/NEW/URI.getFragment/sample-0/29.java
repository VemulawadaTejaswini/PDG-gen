//29
public class func{
public void updatePortAndScheme(final URI uri){
        int port = uri.getPort();
        if (UseHttpForHttpsProcessor.this.portMapping.containsKey(port)) {
            port = UseHttpForHttpsProcessor.this.portMapping.get(port);
        }
        httpUri = new URI("http", uri.getUserInfo(), uri.getHost(), port,
                uri.getPath(),
                uri.getQuery(), uri.getFragment());
}
}
