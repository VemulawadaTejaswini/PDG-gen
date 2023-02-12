public class func{
public void initPtsdbTableValues(long ts){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
        conn.setAutoCommit(true);
        PreparedStatement stmt = conn.prepareStatement("upsert into PTSDB VALUES ('x', 'y', ?, 0.5)");
        stmt.setDate(1, D1);
        stmt.execute();
}
}
