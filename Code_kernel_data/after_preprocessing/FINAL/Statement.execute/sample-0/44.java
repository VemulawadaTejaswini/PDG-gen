public class func{
public void test_recycle(){
        DruidPooledConnection conn = dataSource.getConnection();
        conn.setAutoCommit(false);
        conn.setReadOnly(false);
        Statement stmt = conn.createStatement();
        stmt.execute("select 1");
}
}
