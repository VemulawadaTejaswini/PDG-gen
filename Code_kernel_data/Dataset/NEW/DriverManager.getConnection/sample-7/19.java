//19
public class func{
public void testInListParameterMetaData3(){
        Connection conn = DriverManager.getConnection(getUrl(), TestUtil.TEST_PROPERTIES);
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(1, pmd.getParameterCount());
        assertEquals(String.class.getName(), pmd.getParameterClassName(1));
}
}
