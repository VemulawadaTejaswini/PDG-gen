//547
public class func{
	public void openSpatialDataBase(String dbName){
        return DriverManager.getConnection(databasePath,
                "sa", "sa");
}
}
