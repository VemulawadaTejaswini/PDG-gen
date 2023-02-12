public class func{
public void open(String dbServer,String port,String databaseName,String dbUserName,String dbPassword){
            conn = DriverManager.getConnection(connectionString, dbUserName, dbPassword);
}
}
