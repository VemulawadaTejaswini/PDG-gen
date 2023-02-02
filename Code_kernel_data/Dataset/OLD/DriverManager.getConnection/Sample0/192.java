//191
public class func{
	public void doConnectionSetIsolation(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.setTransactionIsolation(conn.TRANSACTION_SERIALIZABLE);
}
}
