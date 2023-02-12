public class func{
public void getConnection(){
        if (username != null)
            conn = DriverManager.getConnection(jdbcUrl, username, password);
        else
            conn = DriverManager.getConnection(jdbcUrl);
}
}
