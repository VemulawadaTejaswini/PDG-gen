//103
public class func{
	public void executeScript(String dataSourceName,String query){
    Connection connection = DriverManager.getConnection(dataSourceName, USER, PASSWORD);
    Statement stmt = connection.createStatement();
    stmt.execute(query);
    stmt.close();
}
}
