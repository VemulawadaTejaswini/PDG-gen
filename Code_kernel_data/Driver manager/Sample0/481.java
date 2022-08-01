//480
public class func{
	public void createConnection(String dbSchema){
        return DriverManager.getConnection(cloudDbUrl, properties.getProperty("db."+dbSchema+".username"),
                properties.getProperty("db."+dbSchema+".password"));
}
}
