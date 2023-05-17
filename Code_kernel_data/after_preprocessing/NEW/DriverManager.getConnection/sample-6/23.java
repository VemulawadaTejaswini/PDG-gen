//23
public class func{
public void createConnection(){
      Connection ret = DriverManager.getConnection("jdbc:sqlite:"
          + plugin.getDataFolder() + "/Data/Experience.sqlite");
      ret.setAutoCommit(false);
}
}
