public class func{
public void setupTestTableWithData(String tableName,Path dataFilePath,Connection hs2Conn){
    Statement stmt = hs2Conn.createStatement();
    stmt.execute("create table " + tableName
        + " (under_col int comment 'the under column', value string)");
}
}
