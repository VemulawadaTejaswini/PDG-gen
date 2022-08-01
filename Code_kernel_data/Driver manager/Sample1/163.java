//162
public class func{
	public void learn(String sqlQuery,String dbConnectString){
        Connection conn = DriverManager.getConnection(dbConnectString);
        Statement stmt = conn.createStatement(); 
        ResultSet rs = stmt.executeQuery(sqlQuery); 
    learn(rs);
}
}
