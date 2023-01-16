//4
public class func{
	public void verifyTableColumnContents(Connection connection,String table,String column,ColumnGenerator gen){
    Statement st = connection.createStatement();
    assertTrue(st.execute("SELECT " + column + " FROM " + table));
    ResultSet rs = st.getResultSet();
    for (int row = 0; rs.next(); ++row) {
      assertEquals(gen.getVerifyText(row), rs.getString(1));
    }
}
}
