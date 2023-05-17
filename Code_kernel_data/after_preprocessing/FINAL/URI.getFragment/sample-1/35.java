public class func{
public void getPublishableConnectURI(TransportConnector connector){
        URI connectorURI = connector.getConnectUri();
        if (connectorURI == null) {
            return null;
        }
        String scheme = connectorURI.getScheme();
        if ("vm".equals(scheme)) {
            return connectorURI;
        }
        String userInfo = getPublishedUserInfoValue(connectorURI.getUserInfo());
        String host = getPublishedHostValue(connectorURI.getHost());
        int port = connectorURI.getPort();
        if (portMapping.containsKey(port)) {
            port = portMapping.get(port);
        }
        String path = getPublishedPathValue(connectorURI.getPath());
        String fragment = getPublishedFragmentValue(connectorURI.getFragment());
        URI publishedURI = new URI(scheme, userInfo, host, port, path, getClusterClientUriQuery(), fragment);
}
}
