public class func{
public void MySQLDriver(String dbFileNamePrefix,String username,String password){
          conn = DriverManager.getConnection("jdbc:mysql:" + dbFileNamePrefix,
              username,
              password);
}
}
