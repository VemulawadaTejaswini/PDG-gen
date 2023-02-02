//56
public class func{
public void getUserById(Connection conn,int id){
        PreparedStatement prep = conn.prepareStatement("SELECT NAME FROM INFORMATION_SCHEMA.USERS WHERE ID=?");
        prep.setInt(1, id);
        ResultSet rs = prep.executeQuery();
        if (rs.next()) {
            return rs.getString(1);
        }
}
}
