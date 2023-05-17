public class func{
public void setUpJDBC(){
    conn = DriverManager.getConnection("jdbc:derby:"+testDatabasePath.toUri().getPath()+"/db;create=true");
    if (conn == null) {
      throw new InitializationError("JDBC connection is null.");
    }
}
}
