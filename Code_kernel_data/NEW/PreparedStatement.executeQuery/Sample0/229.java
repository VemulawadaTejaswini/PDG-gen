//228
public class func{
	public void doRun(Connection cx){
                String sql = format("SELECT nid FROM %s WHERE alias = ?", MAPPINGS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, node)));
                ps.setString(1, node);
                ResultSet rs = open(ps.executeQuery());
                return rs.next() ? rs.getString(1) : null;
}
}
