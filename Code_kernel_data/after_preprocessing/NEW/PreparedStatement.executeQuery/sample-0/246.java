//246
public class func{
public void doRun(Connection cx){
                String sql = format("SELECT count(*) FROM %s WHERE id = ?", OBJECTS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, id)));
                ps.setString(1, id);
                ResultSet rs = open(ps.executeQuery());
                rs.next();
                return rs.getInt(1) > 0;
}
}
