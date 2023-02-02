//6
public class func{
public void deleteRow(int p1){
                Connection conn = DriverManager.getConnection("jdbc:default:connection");
                PreparedStatement ps = conn.prepareStatement("delete from t1 where i=?");
                ps.setInt(1, p1);
                ps.executeUpdate();
                ps.close();
}
}
