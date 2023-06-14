public class func{
public void setUpBeforeClass(){
    conn = DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mydb", "sa", "");
    stmt = conn.createStatement();
}
}
