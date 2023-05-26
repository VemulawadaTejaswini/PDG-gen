public class func{
public void testDateSubstractExpressionMetaData1(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, TestUtil.TEST_PROPERTIES);
        PreparedStatement statement = conn.prepareStatement(query);
        ParameterMetaData pmd = statement.getParameterMetaData();
        assertEquals(1, pmd.getParameterCount());
        assertEquals(BigDecimal.class.getName(), pmd.getParameterClassName(1));
}
}
