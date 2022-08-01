//19
public class func{
	public void getUserById(int id){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement prep = conn.prepareStatement("SELECT USENAME FROM PG_CATALOG.PG_USER WHERE OID=?");
        prep.setInt(1, id);
        ResultSet rs = prep.executeQuery();
        if (rs.next()) 
        {
            res = rs.getString(1);
        }
        rs.close();
}
}
