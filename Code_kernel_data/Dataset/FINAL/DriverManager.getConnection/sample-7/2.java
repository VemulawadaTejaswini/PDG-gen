public class func{
public void testBindParamMetaDataForNestedRVC(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(3, pmd.getParameterCount());
        assertEquals(String.class.getName(), pmd.getParameterClassName(1));
}
}
