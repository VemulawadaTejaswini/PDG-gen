//151
public class func{
	public void existsTable(Connection con,String tableName){
            ps = con.prepareStatement("SELECT table_name FROM information_schema.tables " +
                    "WHERE table_schema = 'public' " +
                    "AND lower(table_name) = lower(?)");
            ps.setString(1, tableName);
            rs = ps.executeQuery();
            return rs.next();
            close(ps);
}
}
