//150
public class func{
	public void getConnection(){
            DriverManager.getConnection("jdbc:sqlite:pushbot.db");
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS config (member text, config text, PRIMARY KEY (member)); ");
}
}
