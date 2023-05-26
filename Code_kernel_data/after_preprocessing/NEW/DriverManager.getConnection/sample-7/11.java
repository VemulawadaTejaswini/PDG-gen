//11
public class func{
public void testUpsertParameterMetaData(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(5, pmd.getParameterCount());
        assertEquals(String.class.getName(), pmd.getParameterClassName(1));
}
}
