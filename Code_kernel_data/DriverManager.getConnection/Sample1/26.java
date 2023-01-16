//25
public class func{
	public void testSetPropertyAndAddColumnFailsForColumnFamilyNotPresentInAddCol(){
      Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute(ddl);
          conn.createStatement().execute("ALTER TABLE ADDCOLNOTPRESENT ADD col4 integer CF1.REPLICATION_SCOPE=1, XYZ.IN_MEMORY=true ");
}
}
