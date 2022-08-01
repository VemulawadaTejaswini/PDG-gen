//150
public class func{
	public void exists(Connection con,String columnName,String columnValue){
            ps = con.prepareStatement("SELECT 1 FROM " + indexTableName + " WHERE " + columnName + " = ?");
            ps.setString(1, columnValue);
            rs = ps.executeQuery();
            return rs.next();
            close(ps);
}
}
