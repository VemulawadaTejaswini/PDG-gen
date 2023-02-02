//178
public class func{
public void setupKv1Tabs(String tableName){
    Statement stmt = hs2Conn.createStatement();
    stmt.execute("CREATE TABLE " + tableName
        + " (under_col INT COMMENT 'the under column', value STRING)"
        + " COMMENT ' test table'");
}
}
