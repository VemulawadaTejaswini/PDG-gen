public class func{
public void selectRows(int p1,int p2,int p3,int p4,ResultSet[] rs1,ResultSet[] rs2){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps1 = conn.prepareStatement("select * from account where acc_id in (?,?)");
    ps1.setInt(2, p2);
    rs1[0] = ps1.executeQuery();
}
}
