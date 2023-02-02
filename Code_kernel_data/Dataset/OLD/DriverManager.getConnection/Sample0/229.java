//228
public class func{
	public void createOracleConnection(){
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost/orcl",
                "glowroot", "glowroot");
        insertRecords(connection);
}
}
