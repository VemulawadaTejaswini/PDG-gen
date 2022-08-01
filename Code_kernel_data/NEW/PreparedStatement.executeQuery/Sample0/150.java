//149
public class func{
	public void exists2(Connection con,String columnName1,String columnValue1,String columnName2,String columnValue2){
            ps = con.prepareStatement("SELECT 1 FROM " + indexTableName + " WHERE " + columnName1 + " = ? AND " + columnName2 + " = ?");
            ps.setString(2, columnValue2);
            rs = ps.executeQuery();
            return rs.next();
            close(ps);
}
}
