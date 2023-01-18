//482
public class func{
	public void getConnection(){
            Connection conn = DriverManager.getConnection(url, user, password);
            setAutoCommit(conn, autoCommit);
            setIsolation(conn, isolation);
}
}
