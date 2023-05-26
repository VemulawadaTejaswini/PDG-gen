public class func{
public void testNegativeAddNegativeValue(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement stmt = conn.prepareStatement("UPSERT INTO HBASE_NATIVE(uint_key,ulong_key,string_key, uint_col) VALUES(?,?,?,?)");
            stmt.setInt(1, -1);
            stmt.setLong(2, 2L);
            stmt.setString(3,"foo");
            stmt.setInt(4, 3);
            stmt.execute();
}
}
