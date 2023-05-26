public class func{
public void createIndex(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps = conn.prepareStatement("create index ix on t1(i,b)");
    ps.execute();
    ps.close();
}
}
