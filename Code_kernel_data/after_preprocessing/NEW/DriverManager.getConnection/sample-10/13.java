//13
public class func{
public void getConnection(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.close();
}
}
