//13
public class func{
public void doRun(Connection cx){
                String sql = format(
                        "SELECT conflict FROM %s WHERE namespace = ? AND path LIKE '%%%s%%'",
                        CONFLICTS, pathFilter);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, namespace)));
                ps.setString(1, namespace);
                return ps.executeQuery();
}
}
