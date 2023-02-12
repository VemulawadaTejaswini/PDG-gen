public class func{
public void ImportConfigurationJDBC(String url,String user,String password,String table){
        this.connection = DriverManager.getConnection(url, user, password);
}
}
