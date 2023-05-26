public class func{
public void getConnection(){
      Connection c = currentConnection.get();
      if(c == null) {
        try {
          c = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
          throw new SienaException(e);
        }
        currentConnection.set(c);
      }
}
}
