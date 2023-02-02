//541
public class func{
public void createConnection(){
        return DriverManager.getConnection(conf.get("url"), conf.get("user"), conf.get("password"));
}
}
