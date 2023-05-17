//16
public class func{
public void doRun(Connection cx){
                String sql = format("SELECT count(*) FROM %s WHERE namespace = ?", CONFLICTS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, namespace)));
                ps.setString(1, namespace);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    count = rs.getInt(1);
                }
                rs.close();
                return Integer.valueOf(count);
}
}
