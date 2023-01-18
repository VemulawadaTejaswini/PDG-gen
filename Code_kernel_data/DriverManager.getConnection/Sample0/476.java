//475
public class func{
	public void prepareDatabase(String sqlFile,DbImportConfiguration dbImportConfiguration){
    Statement stmt = DriverManager.getConnection(dbImportConfiguration.getUrl()).createStatement();
}
}
