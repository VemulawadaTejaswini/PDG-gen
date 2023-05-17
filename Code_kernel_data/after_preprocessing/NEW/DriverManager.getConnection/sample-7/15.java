//15
public class func{
public void testCaseInsensitive(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(0, pmd.getParameterCount());
}
}
