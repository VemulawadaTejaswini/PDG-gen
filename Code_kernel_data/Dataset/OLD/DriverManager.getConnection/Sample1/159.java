//158
public class func{
	public void getData(String dataDir,String query){
                  "DBQ=" + new File(dataDir, "Customers.mdb") + ";UID=Admin";
    Connection connection = DriverManager.getConnection(connectionString);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        return statement.executeQuery(query);
}
}
