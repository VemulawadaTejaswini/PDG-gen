public class func{
public void testMissingPKColumn(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
        conn.setAutoCommit(true);
        Statement stmt = conn.createStatement();
            stmt.execute("upsert into PTSDB(INST,HOST,VAL) VALUES ('abc', 'abc-def-ghi', 0.5)");
}
}
