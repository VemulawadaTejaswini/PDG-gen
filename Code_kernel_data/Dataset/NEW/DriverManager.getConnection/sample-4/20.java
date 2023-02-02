//20
public class func{
public void getConnection(){
      if (username != null) {
        conn = DriverManager.getConnection(url, username, password);
      } else {
        conn = DriverManager.getConnection(url);
      }
}
}
