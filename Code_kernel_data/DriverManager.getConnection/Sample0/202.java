//201
public class func{
	public void initTable(){
        testConn = DriverManager.getConnection(getUrl(), props);
        assertEquals(Consistency.STRONG, ((PhoenixConnection)testConn).getConsistency());
}
}
