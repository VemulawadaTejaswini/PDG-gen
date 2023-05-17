public class func{
public void testSubstrParameterMetaData(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(3, pmd.getParameterCount());
        assertEquals(Long.class.getName(), pmd.getParameterClassName(1));
}
}
