public class func{
public void tearDown(){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:race", "sa", "");
        Statement stmt = conn.createStatement();
        stmt.execute("SHUTDOWN");
}
}
