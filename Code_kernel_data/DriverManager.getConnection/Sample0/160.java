//159
public class func{
	public void loadDataFromFile(String fileName){
            jdbcConnection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/" + databaseName + "?sessionVariables=FOREIGN_KEY_CHECKS=0", user, password);
            IDatabaseConnection databaseConnection = new DatabaseConnection(jdbcConnection);
            databaseConnection.getConfig().setProperty(DatabaseConfig.FEATURE_CASE_SENSITIVE_TABLE_NAMES, Boolean.TRUE);
}
}
