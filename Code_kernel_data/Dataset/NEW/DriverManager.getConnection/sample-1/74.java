//74
public class func{
public void createBaseTable(String tableName,Integer saltBuckets,String splits){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
