public class func{
public void testRowValueConstructorBindParamMetaDataWithMoreNumberOfBindArgs(){
        Connection conn = DriverManager.getConnection(getUrl(), TestUtil.TEST_PROPERTIES);
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(3, pmd.getParameterCount());
        assertEquals(Integer.class.getName(), pmd.getParameterClassName(1));
}
}
