//98
public class func{
	public void init(){
    connection = DriverManager.getConnection("jdbc:h2:~/ehcache-demo-peeper", "sa", "");
    Statement statement = connection.createStatement();
      statement.execute("CREATE TABLE IF NOT EXISTS PEEPS (" +
          "id bigint auto_increment primary key," +
          "PEEP_TEXT VARCHAR(142) NOT NULL" +
          ")");
}
}
