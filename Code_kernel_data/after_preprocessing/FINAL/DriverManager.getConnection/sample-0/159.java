public class func{
public void loadDataFromFile(String fileName){
            jdbcConnection = DriverManager.getConnection(
                    "jdbc:mysql:
            IDatabaseConnection databaseConnection = new DatabaseConnection(jdbcConnection);
            databaseConnection.getConfig().setProperty(DatabaseConfig.FEATURE_CASE_SENSITIVE_TABLE_NAMES, Boolean.TRUE);
}
}
