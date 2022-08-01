//5
public class func{
	public void setIsolationSQL(String sqlName){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
        s.execute("SET ISOLATION " + sqlName);
        s.close();
}
}
