//85
public class func{
public void createTableAndInsertRows(String tableName,int numRows,boolean salted,boolean addTableNameToKey){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        PreparedStatement stmt = conn.prepareStatement(dml);
}
}
