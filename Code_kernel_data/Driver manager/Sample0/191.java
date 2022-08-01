//190
public class func{
	public void setUpTestCase(){
        DriverManager.getDriver(
            "jdbc:proxy:org.apache.drill.jdbc.Driver:jdbc:drill:zk=local" );
        DriverManager.getConnection( "jdbc:proxy::jdbc:drill:zk=local" );
}
}
