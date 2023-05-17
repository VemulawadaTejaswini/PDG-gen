//24
public class func{
public void testNoParameterMetaData(){
        Connection conn = DriverManager.getConnection(getUrl(), TestUtil.TEST_PROPERTIES);
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(0, pmd.getParameterCount());
}
}
