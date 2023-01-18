//526
public class func{
	public void checkInvalidTerritoryFormat(String territory){
            String url = getReadWriteJDBCURL("fail3");
            DriverManager.getConnection(url);
            fail("connection without territory: " + url + "should have failed");
          assertSQLState("XJ041", se);
          assertSQLState("XBM0X", se.getNextException());
}
}
