//5
public class func{
public void alterTable(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps = conn.prepareStatement("alter table t1 add column test integer");
    ps.execute();
    ps.close();
}
}
