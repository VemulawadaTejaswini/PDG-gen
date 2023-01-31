//245
public class func{
	public void doRun(Connection cx){
                String sql = format("SELECT object FROM %s WHERE id = ?", OBJECTS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, id)));
                ps.setString(1, id);
                ResultSet rs = open(ps.executeQuery());
                if (!rs.next()) {
                    return null;
                }
                byte[] bytes = rs.getBytes(1);
                return new ByteArrayInputStream(bytes);
}
}
