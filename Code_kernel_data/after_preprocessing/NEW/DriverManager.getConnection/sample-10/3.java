//3
public class func{
public void testInit(){
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        conn.close();
}
}
