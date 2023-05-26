public class func{
public void insertRow(int p1,String p2){
        Connection conn = DriverManager
                .getConnection("jdbc:default:connection");
        PreparedStatement ps = conn
                .prepareStatement("insert into t1 values (?, ?)");
        ps.setInt(1, p1);
        ps.setString(2, p2);
        ps.executeUpdate();
        ps.close();
}
}
