//11
public class func{
	public void check(Connection conn,int len,String expectedCluster){
        for (int i = 0; i < len; i++) {
            prep.setInt(1, i);
            ResultSet rs = prep.executeQuery();
            rs.next();
            assertEquals("Data" + i, rs.getString(2));
            assertFalse(rs.next());
        }
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT VALUE FROM INFORMATION_SCHEMA.SETTINGS WHERE NAME='CLUSTER'");
        String cluster = rs.next() ? rs.getString(1) : "''";
        assertEquals(expectedCluster, cluster);
}
}
