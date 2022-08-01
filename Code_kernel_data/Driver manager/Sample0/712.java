//711
public class func{
	public void getJdbcConnection(){
        return DriverManager.getConnection("jdbc:hsqldb:mem:testdb");
}
}
