public class func{
public void open(){
      String url = "jdbc:derby:net://" + getHostname() + ":" + getPort() + "/" + getDatabase();
        connection = DriverManager.getConnection(url, getUsername(), getPassword());
}
}
