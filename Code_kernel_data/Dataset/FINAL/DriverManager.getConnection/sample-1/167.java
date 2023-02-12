public class func{
public void getConnectionProc(){
                Connection conn = DriverManager.getConnection("jdbc:default:connection");
                Statement s = conn.createStatement();
                conn.close();
}
}
