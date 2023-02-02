//16
public class func{
public void f_test_createIndex(){
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
}
}
