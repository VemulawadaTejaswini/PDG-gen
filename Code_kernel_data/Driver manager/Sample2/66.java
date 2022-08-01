//65
public class func{
	public void countRows(String schema,String table){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement s = conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT COUNT(*) FROM " + schema + "." + table);
    rs.next();
    int count = rs.getInt(1);
    rs.close();
}
}
