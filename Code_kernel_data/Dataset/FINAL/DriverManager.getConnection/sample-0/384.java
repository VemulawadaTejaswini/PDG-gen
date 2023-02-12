public class func{
public void connectJdbc(String driverName,String url,String login,String password){
      result = DriverManager.getConnection(url, login, password);
}
}
