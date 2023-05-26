//8
public class func{
public void test(){
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, 30);
        rs = ps.executeQuery();
        rs.next();
}
}
