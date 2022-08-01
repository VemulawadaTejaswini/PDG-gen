//152
public class func{
	public void connect(){
        conn = DriverManager.getConnection(connectionString);
        conn.setAutoCommit(false);
        conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
        updatePreviewReplyStmt = conn.prepareStatement(updatePreviewReplyQuery);
}
}
