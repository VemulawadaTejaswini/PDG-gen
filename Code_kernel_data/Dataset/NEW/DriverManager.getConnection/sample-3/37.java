//37
public class func{
public void selectAuthorViaOutParams(int id,String[] username,String[] password,String[] email,String[] bio){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps = conn.prepareStatement("select * from author where id = ?");
    ps.setInt(1, id);
    ResultSet rs = ps.executeQuery();
    rs.next();
    bio[0] = rs.getString("bio");
}
}
