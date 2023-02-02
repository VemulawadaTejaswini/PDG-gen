//170
public class func{
	public void getTotalUsersCommon(PreparedStatement p){
    ResultSet rs = p.executeQuery();
    rs.next();
    int total = rs.getInt(1);
    rs.close();
}
}
