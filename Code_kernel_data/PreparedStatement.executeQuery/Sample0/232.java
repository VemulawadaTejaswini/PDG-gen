//231
public class func{
	public void doRun(Connection cx){
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, s, k)));
                ps.setString(2, k);
                ResultSet rs = open(ps.executeQuery());
                return rs.next() ? rs.getString(1) : null;
}
}
