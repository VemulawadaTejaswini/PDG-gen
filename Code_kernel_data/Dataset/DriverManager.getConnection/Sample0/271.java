//270
public class func{
	public void testConnect(){
                Connection c = jDriver.connect(getConnectionURL(), null);
                assertFalse(c.isClosed());
                DriverManager.getConnection(getConnectionURL());
}
}
