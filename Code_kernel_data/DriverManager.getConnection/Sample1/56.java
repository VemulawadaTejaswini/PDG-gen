//55
public class func{
	public void getTableTester(String normalizedName,String sqlStatementName){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute("CREATE TABLE " + sqlStatementName + " (k VARCHAR PRIMARY KEY)");
}
}
