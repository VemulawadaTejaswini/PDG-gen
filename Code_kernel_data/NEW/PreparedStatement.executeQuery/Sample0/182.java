//181
public class func{
	public void testPreparedSetSchemaFunctionLarge(){
        PreparedStatement ps = prepareStatement("SELECT X, " +
                "APP.GET_SCHEMA_TRANSITION(SCHEMANAME), " +
                "Y FROM APP.LARGE");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            assertTrue(rs.getString(2).length() > 2);
            verifyCachedSchema(getConnection());
        }
}
}
