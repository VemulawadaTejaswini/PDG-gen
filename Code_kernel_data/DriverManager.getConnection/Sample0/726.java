//725
public class func{
	public void createConnection(){
      return DriverManager.getConnection("jdbc:mysql://"
          + plugin.MySqlDir + "", "" + plugin.MySqlUser + "", ""
          + plugin.MySqlPass + "");
}
}
