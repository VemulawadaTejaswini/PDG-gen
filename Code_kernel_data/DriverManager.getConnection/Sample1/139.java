//138
public class func{
	public void runLiquibase(){
        Connection conn = DriverManager
                .getConnection(MYSQL_TEST_DB_URL, "root", "root");
        Statement statement = conn.createStatement();
        statement.executeUpdate("use zanata_unit_test");
}
}
