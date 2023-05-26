public class func{
public void connect(Configuration hiveconf){
      DriverManager.setLoginTimeout(3);
      conn = DriverManager.getConnection(connectionString);
}
}
