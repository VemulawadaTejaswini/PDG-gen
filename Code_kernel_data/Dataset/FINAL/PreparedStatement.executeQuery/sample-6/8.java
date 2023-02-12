public class func{
public void doRun(Connection cx){
                String sql = format("SELECT src FROM %s WHERE dst = ?", EDGES);
                PreparedStatement ps = cx.prepareStatement(log(sql, LOG, node));
                ps.setString(1, node);
                return ps.executeQuery();
}
}
