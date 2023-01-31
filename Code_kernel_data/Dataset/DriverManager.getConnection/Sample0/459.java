//458
public class func{
	public void createSqlServerConnection(){
                DriverManager.getConnection("jdbc:sqlserver://localhost", "sa", "password");
        insertRecords(connection);
}
}
