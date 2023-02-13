public class func{
public void setUpBeforeClass(){
    conn = DriverManager.getConnection("jdbc:h2:tcp:
    stmt = conn.createStatement();
}
}
