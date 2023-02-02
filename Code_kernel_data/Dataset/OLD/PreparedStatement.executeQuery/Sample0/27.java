//26
public class func{
	public void existsTable(String schemaName,String tableName,Connection con){
    PreparedStatement ps = con.prepareStatement(
        "SELECT TABNAME FROM SYSCAT.TABLES WHERE TABSCHEMA = ? AND TABNAME = ?");
    ps.setString(2,tableName);
    ResultSet rs = ps.executeQuery();
    if (rs.next())
      retval = true;
    rs.close();
}
}
