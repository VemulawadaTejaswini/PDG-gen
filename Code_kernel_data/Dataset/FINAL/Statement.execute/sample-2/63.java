public class func{
public void testQueryTimeout(){
        deleteDb("cancel");
        Connection conn = getConnection("cancel");
        Statement stat = conn.createStatement();
        stat.execute("SET QUERY_TIMEOUT 10");
        assertThrows(ErrorCode.STATEMENT_WAS_CANCELED, stat).
                executeQuery("SELECT MAX(RAND()) " +
                        "FROM SYSTEM_RANGE(1, 100000000)");
}
}
