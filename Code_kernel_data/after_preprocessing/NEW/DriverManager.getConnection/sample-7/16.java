//16
public class func{
public void testStringConcatMetaData(){
      Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TestUtil.TEST_PROPERTIES));
      PreparedStatement statement = conn.prepareStatement(query);
      statement.setString(1, "foo");
      ParameterMetaData pmd = statement.getParameterMetaData();
      assertEquals(1, pmd.getParameterCount());
      assertEquals(String.class.getName(), pmd.getParameterClassName(1));
}
}
