//184
public class func{
public void testPreparedSetSchemaFunction(){
        PreparedStatement ps = prepareStatement("SELECT " +
                "APP.GET_SCHEMA_TRANSITION(SCHEMANAME) FROM SYS.SYSSCHEMAS");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            assertTrue(rs.getString(1).length() > 2);
            verifyCachedSchema(getConnection());
        }
}
}
