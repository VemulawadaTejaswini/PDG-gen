public class func{
public void grantSelect(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps = conn.prepareStatement("grant select on t1 to user2");
    ps.execute();
    ps.close();
}
}
