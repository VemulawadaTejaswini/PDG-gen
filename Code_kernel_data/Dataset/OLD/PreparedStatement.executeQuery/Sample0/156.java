//155
public class func{
	public void getNumberOfRegistrations(){
      con = DbConnectionManager.getConnection();
      pstmt = con.prepareStatement(GET_SESSION_COUNT);
      ResultSet rs = pstmt.executeQuery();
      rs.next();
      result = rs.getInt(1);
}
}
