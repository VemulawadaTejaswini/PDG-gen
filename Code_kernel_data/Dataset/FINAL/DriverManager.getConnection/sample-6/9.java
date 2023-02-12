public class func{
public void create(){
    Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);
    conn.setAutoCommit(true);
    return new JdbcPerfTest(conn, sql);
}
}
