//20
public class func{
public void testTwoDateSubstractExpressionMetaData(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, TestUtil.TEST_PROPERTIES);
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(1, pmd.getParameterCount());
        assertEquals(Date.class.getName(), pmd.getParameterClassName(1));
}
}
