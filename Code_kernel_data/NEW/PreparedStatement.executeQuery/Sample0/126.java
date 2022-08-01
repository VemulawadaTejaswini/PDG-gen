//125
public class func{
	public void getMaxId(DBConfiguration conf,Connection conn,String tableName,String col){
                conn.prepareStatement("SELECT MAX(" + col + ") FROM " + tableName);
            ResultSet rs = s.executeQuery();
            rs.next();
            long ret = rs.getLong(1);
            rs.close();
}
}
