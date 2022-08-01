//679
public class func{
	public void createNewBootstrapConnection(){
    _bootstrapConn = DriverManager.getConnection(_url);
    _bootstrapConn.setAutoCommit(_autoCommit);
    _bootstrapConn.setTransactionIsolation(_isolationLevel);
}
}
