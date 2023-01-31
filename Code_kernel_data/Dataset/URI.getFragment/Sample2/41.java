//40
public class func{
	public void assertCreateConnection(String uri){
        URI connectURI = new URI(temp.getScheme(), temp.getUserInfo(), temp.getHost(), currentURI.getPort(),
                                 temp.getPath(), temp.getQuery(), temp.getFragment());
        LOG.info("connection URI is: " + connectURI);
        ActiveMQXAConnectionFactory cf = new ActiveMQXAConnectionFactory(connectURI);
        Connection connection = cf.createConnection();
        assertXAConnection(connection);
        assertNotNull(connection);
        connection.close();
        connection = cf.createXAConnection();
        assertXAConnection(connection);
        assertNotNull(connection);
}
}
