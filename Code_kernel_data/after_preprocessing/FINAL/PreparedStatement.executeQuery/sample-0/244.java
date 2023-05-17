public class func{
public void hasTentativeJournalsForUser(Connection con,String userId){
      prepStmt = getTentativePreparedStatement(con, userId);
      rs = prepStmt.executeQuery();
      return rs.next();
      DBUtil.close(rs, prepStmt);
}
}
