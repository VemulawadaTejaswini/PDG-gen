public class func{
public void establishConnection(){
    if (username == null) {
      dbConn = DriverManager.getConnection(dbURL);
    } else {
      dbConn = DriverManager.getConnection(dbURL, username, password);
    }
}
}
