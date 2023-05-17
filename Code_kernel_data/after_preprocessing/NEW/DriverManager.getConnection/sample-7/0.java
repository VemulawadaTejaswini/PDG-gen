//0
public class func{
public void testInListParameterMetaData4(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(3, pmd.getParameterCount());
        assertEquals(null, pmd.getParameterClassName(1));
        assertEquals(null, pmd.getParameterClassName(2));
        assertEquals(null, pmd.getParameterClassName(3));
}
}
