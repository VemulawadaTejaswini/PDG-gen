//219
public class func{
public void open(String driver,String url,Properties props){
            Connection connection = DriverManager.getConnection(url, props);
            ConnectionsAccess.attach(name, connection, url);
            throw new InitException("Failed to connect to JDBC URL: " + url, e);
}
}
