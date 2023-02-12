public class func{
public void readSomeFoos(int fromId,int toId,ResultSet[] rs){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement ps2 = conn.prepareStatement(SQL);
        ps2.setInt(2, toId);
        rs[0] = ps2.executeQuery();
}
}
