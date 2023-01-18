//297
public class func{
	public void createDB(String dbName){
      return DriverManager.getConnection("jdbc:derby:"+dbName+";create=true");
}
}
