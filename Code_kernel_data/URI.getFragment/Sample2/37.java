//36
public class func{
	public void createConnection(){
        URI actualURI = connector.getServer().getConnectURI();
        URI connectURI = new URI(actualURI.getScheme(), actualURI.getUserInfo(), bindURI.getHost(), actualURI.getPort(), actualURI.getPath(), bindURI
                .getQuery(), bindURI.getFragment());
        Transport transport = TransportFactory.connect(connectURI);
        StubConnection connection = new StubConnection(transport);
        connections.add(connection);
}
}
