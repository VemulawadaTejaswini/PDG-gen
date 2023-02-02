//14
public class func{
public void testCoerceToDecimalArithmeticMetaData(){
            Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, 4);
            ParameterMetaData pmd = statement.getParameterMetaData();
            assertEquals(1, pmd.getParameterCount());
            assertEquals(BigDecimal.class.getName(), pmd.getParameterClassName(1));
}
}
