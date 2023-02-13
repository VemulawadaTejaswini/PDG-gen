public class func{
public void assertConnection(int port){
        final Connection conn = DriverManager.getConnection(connectionStr);
            final Statement stmt = conn.createStatement();
            final ResultSet rs = stmt.executeQuery("values(1)");
            while (rs.next()) {
                valueFound = true;
                Assert.assertEquals("1", rs.getString(1));
            }
            Assert.assertTrue("No value found.", valueFound);
}
}
