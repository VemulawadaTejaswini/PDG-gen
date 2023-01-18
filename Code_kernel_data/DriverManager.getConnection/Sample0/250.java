//249
public class func{
	public void testSetConsistencyInURL(){
            Connection conn = DriverManager.getConnection(getUrl() + PhoenixRuntime.JDBC_PROTOCOL_TERMINATOR +
                    "Consistency=TIMELINE", props);
            assertEquals(Consistency.TIMELINE, ((PhoenixConnection)conn).getConsistency());
}
}
