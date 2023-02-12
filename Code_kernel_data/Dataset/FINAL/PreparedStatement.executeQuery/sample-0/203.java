public class func{
public void prepareAndExecuteQuery(Connection conn,String sql){
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    rs.next();
}
}
