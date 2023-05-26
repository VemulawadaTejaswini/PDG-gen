//1
public class func{
public void testBindParamMetaDataForCreateTable(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(ddl);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(2, pmd.getParameterCount());
        assertEquals(byte[].class.getName(), pmd.getParameterClassName(1));
}
}
