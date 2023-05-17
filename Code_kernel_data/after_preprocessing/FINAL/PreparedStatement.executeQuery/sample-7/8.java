public class func{
public void selectTwoSetsOfTwoAuthors(int p1,int p2,ResultSet[] rs1,ResultSet[] rs2){
    PreparedStatement ps2 = conn.prepareStatement("select * from author where id in (?,?)");
    ps2.setInt(2, p1);
    rs2[0] = ps2.executeQuery();
}
}
