//273
public class func{
	public void getHiveConnection(){
        return DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "hive", "");
}
}
