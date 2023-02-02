//399
public class func{
	public void HsqlBackend(int siteId){
            final String connectionURL = "jdbc:hsqldb:mem:x" + String.valueOf(siteId);
            dbconn = DriverManager.getConnection(connectionURL, "sa", "");
            dbconn.setAutoCommit(true);
            dbconn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
}
}
