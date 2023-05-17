public class func{
public void readDataTableIndexRow(Connection conn,String schemaName,String tableName,String indexName){
        PreparedStatement stmt = conn.prepareStatement(SELECT_DATA_INDEX_ROW);
        stmt.setString(3, indexName);
        return stmt.executeQuery();
}
}
