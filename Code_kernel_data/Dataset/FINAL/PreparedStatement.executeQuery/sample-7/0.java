public class func{
public void selectTwoSetsOfTwoAuthors(int p1,int p2,ResultSet[] rs1,ResultSet[] rs2){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps1 = conn.prepareStatement("select * from author where id in (?,?)");
    ps1.setInt(2, p2);
    rs1[0] = ps1.executeQuery();
}
}
