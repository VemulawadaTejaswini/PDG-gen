//215
public class func{
	public void getTentativeJournalHeadersForUser(Connection con,String userId){
      prepStmt = getTentativePreparedStatement(con, userId);
      rs = prepStmt.executeQuery();
      while (rs.next()) {
        JournalHeader journal = getJournalHeaderFromResultSet(rs);
        list.add(journal);
      }
      DBUtil.close(rs, prepStmt);
}
}
