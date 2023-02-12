public class func{
public void isUserManager(Connection con,String userId){
      prepStmt.setInt(1, Integer.parseInt(userId));
      rs = prepStmt.executeQuery();
      return (rs.next());
      DBUtil.close(rs, prepStmt);
}
}
