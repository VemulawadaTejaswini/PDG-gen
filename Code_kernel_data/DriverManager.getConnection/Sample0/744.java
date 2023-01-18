//743
public class func{
	public void createConnection(String testDB){
    return DriverManager.getConnection(
            "jdbc:mysql://"+ MySqlTestConfig.host + ":" +
                    MySqlTestConfig.port + "/" + testDB +
            "?elideSetAutoCommits=true" +
            "&useLocalTransactionState=true" +
            "&allowMultiQueries=true" +
            "&useLocalSessionState=true",
            MySqlTestConfig.user, MySqlTestConfig.pass);
}
}
