//137
public class func{
public void doConnCommit(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.commit();
}
}
