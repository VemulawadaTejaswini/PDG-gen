//0
public class func{
public void initDateTableValues(String tenantId,byte[][] splits,long ts,Date startDate,double dateIncrement){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            assertNoRows(conn);
            initDateTableValues(conn, tenantId, startDate, dateIncrement);
            conn.commit();
            conn.close();
}
}
