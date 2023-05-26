//206
public class func{
public void MatchDatabase(String dbUrl,String dbUser,String dbPassword){
      conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
      throw new RuntimeException("Could not get database connection to " + dbUrl, e);
}
}
