//36
public class func{
public void getConnection(){
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(dsn, user, pass);
        }
}
}
