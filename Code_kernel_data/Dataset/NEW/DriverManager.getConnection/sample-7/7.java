//7
public class func{
public void testDateSubstractExpressionMetaData2(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(1, pmd.getParameterCount());
        assertEquals(null, pmd.getParameterClassName(1));
}
}
