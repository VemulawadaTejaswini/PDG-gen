public class func{
public void test_connect(){
        Connection conn = DriverManager.getConnection(url);
        conn.close();
}
}
