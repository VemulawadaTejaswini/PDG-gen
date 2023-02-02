//16
public class func{
public void createTrigger(){
                Connection conn = DriverManager.getConnection("jdbc:default:connection");
                PreparedStatement ps = conn.prepareStatement("create trigger test_trig" +
                                " AFTER delete on t1 for each STATEMENT insert into" +
                                " t1 values(20, 'twenty')");
                ps.execute();
                ps.close();
}
}
