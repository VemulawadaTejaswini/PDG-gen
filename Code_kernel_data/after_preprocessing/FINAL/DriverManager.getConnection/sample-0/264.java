public class func{
public void createConnection(){
            return DriverManager.getConnection(getUrl(), getUsername(), getPassword());
}
}
