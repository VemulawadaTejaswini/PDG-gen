public class func{
public void getUser(Connection conn,String userName,String password){
        PreparedStatement prep = conn.prepareStatement(
                "SELECT * FROM USERS WHERE NAME=? AND PASSWORD=?");
        prep.setString(2, password);
        return prep.executeQuery();
}
}
