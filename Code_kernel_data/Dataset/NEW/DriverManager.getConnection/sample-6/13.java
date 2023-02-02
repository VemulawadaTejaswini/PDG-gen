//13
public class func{
public void getDirectConnection(){
        Connection conn = DriverManager.getConnection(url, user, password);
        conn.setAutoCommit(true);
        conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
}
}
