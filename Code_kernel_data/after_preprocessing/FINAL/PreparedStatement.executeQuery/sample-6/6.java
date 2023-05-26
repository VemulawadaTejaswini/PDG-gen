public class func{
public void testNonNullMultiCondCaseStatement(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            assertEquals(ResultSetMetaData.columnNoNulls,rsm.isNullable(1));
            conn.close();
}
}
