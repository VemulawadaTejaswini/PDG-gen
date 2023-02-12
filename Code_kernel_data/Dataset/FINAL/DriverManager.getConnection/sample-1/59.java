public class func{
public void createIndex(String indexName,String tableName,String columns){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
