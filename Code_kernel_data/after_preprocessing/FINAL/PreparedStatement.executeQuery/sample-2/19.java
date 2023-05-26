public class func{
public void blobselect(ResultSet[] results){
        Connection conn = DriverManager.getConnection(
      "jdbc:default:connection");
    PreparedStatement st = conn.prepareStatement("select * from lobCheckTwo");
    results[0] = st.executeQuery();
}
}
