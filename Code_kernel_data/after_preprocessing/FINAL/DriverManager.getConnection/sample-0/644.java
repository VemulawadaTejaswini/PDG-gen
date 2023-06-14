public class func{
public void getConnectionFromDriverManager(){
      return DriverManager.getConnection(
        "jdbc:postgresql://" + loginCredentials.getHost() + "/"
        + loginCredentials.getDatabase(),
          loginCredentials.getUser(),
          loginCredentials.getPassword()
        );
}
}
