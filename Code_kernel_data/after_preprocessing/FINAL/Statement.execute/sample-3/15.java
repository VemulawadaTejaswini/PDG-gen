public class func{
public void dropTable(){
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute(ddl);
        stmt.close();
}
}
