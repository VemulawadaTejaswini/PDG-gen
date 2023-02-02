//5
public class func{
public void testRowValueConstructorBindParamMetaDataWithLessNumberOfBindArgs(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(2, pmd.getParameterCount());
        assertEquals(Integer.class.getName(), pmd.getParameterClassName(1));
}
}
