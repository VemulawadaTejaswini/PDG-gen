//644
public class func{
	public void getConnectionFromDriverManager(){
      return DriverManager.getConnection(
        "jdbc:postgresql://" + loginCredentials.getHost() + "/"
        + loginCredentials.getDatabase(),
          // + "?logLevel=2"
          loginCredentials.getUser(),
          loginCredentials.getPassword()
        );
}
}
