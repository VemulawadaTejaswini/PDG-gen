public class func{
public void testRowValueConstructorBindParamMetaDataWithBindArgsAtSamePlacesOnLHSRHS(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(2, pmd.getParameterCount());
        assertEquals(null, pmd.getParameterClassName(1));
        assertEquals(null, pmd.getParameterClassName(2));
}
}
