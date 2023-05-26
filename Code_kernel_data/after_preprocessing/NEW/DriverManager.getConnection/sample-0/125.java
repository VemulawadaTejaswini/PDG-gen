//125
public class func{
public void createConnection(Properties p){
      Connection conn = DriverManager.getConnection(p.getProperty("db_uri").trim(), p.getProperty("db_user")
          .trim(), p.getProperty("db_password").trim());
}
}
