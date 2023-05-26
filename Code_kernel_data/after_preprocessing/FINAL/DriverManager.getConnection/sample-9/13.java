public class func{
public void main(String[] args){
        Connection con = DriverManager.getConnection(Constants.URL, Constants.USER,
                Constants.PASS);
        PreparedStatement ps = con.prepareStatement("insert into tt (c) values (?)");
        ps.setString(1, str);
        ps.executeUpdate();
}
}
