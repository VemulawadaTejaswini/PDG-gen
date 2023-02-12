public class func{
public void open(){
      String url = "jdbc:sqlserver://" + getHostname() + ":" + getPort() + ";databaseName=" + getDatabase() + ";user=" + getUsername() + ";password=" + getPassword();
        this.connection = DriverManager.getConnection(url, getUsername(), getPassword());
}
}
