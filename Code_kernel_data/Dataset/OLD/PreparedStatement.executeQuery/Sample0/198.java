//197
public class func{
	public void checkPasswordSecure(String pwd){
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setString(1, pwd);
        ResultSet rs = prep.executeQuery();
        return rs.next();
}
}
