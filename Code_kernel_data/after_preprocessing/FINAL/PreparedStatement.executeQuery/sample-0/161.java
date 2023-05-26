public class func{
public void getMode(){
            PreparedStatement prep = conn.prepareStatement(
                    "SELECT VALUE FROM INFORMATION_SCHEMA.SETTINGS WHERE NAME=?");
            prep.setString(1, "MODE");
            ResultSet rs = prep.executeQuery();
            rs.next();
            mode = rs.getString(1);
}
}
