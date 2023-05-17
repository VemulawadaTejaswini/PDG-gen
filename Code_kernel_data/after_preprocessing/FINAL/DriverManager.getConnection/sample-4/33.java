public class func{
public void createConnection(){
            if (_username != null && _password != null) {
                return DriverManager.getConnection(_jdbcUrl, _username, _password);
            } else {
                return DriverManager.getConnection(_jdbcUrl);
            }
}
}
