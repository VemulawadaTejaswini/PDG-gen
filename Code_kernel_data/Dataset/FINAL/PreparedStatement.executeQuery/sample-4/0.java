public class func{
public void run(){
                            Connection con = dataSource.getConnection();
                            PreparedStatement ps = con.prepareStatement("select 1");
                            ResultSet rs = ps.executeQuery();
                            rs.close();
}
}
