//58
public class func{
	public void truncate(){
      connection = SymfonyDbFactory.getInstance().createConnection();
      Statement statement = connection.createStatement();
      statement.execute(QUERY_TRUNCATE);
}
}
