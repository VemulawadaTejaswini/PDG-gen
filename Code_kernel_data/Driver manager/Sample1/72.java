//71
public class func{
	public void createBaseTable(String tableName,Integer saltBuckets){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
