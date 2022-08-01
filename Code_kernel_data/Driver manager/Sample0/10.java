//9
public class func{
	public void getConnection(){
      if(jdbcUsername == null || jdbcUsername.length() == 0) {
        connection = DriverManager.getConnection(jdbcUrl);
      } else {
        connection = DriverManager.getConnection(jdbcUrl, jdbcUsername,
            jdbcPassword);
      }
      connection.setAutoCommit(false);
}
}
