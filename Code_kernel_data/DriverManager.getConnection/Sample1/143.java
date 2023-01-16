//142
public class func{
	public void executeSql(String sql){
            DriverManager.getConnection(
                "jdbc:default:connection");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
}
}
