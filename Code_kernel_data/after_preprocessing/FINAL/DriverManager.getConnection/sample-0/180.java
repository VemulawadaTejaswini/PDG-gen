public class func{
public void setIsolationJDBC(int isolation){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        c.setTransactionIsolation(isolation);
}
}
