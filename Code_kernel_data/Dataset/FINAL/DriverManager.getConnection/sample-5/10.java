public class func{
public void dropTable(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps = conn.prepareStatement("drop table t1");
    ps.execute();
    ps.close();
}
}
