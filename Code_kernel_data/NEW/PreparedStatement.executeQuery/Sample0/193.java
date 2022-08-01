//192
public class func{
	public void existRaterRating(Connection con,RaterRatingPK pk){
    prepStmt.setString(1, pk.getInstanceId());
    prepStmt.setString(2, pk.getContributionId());
    prepStmt.setString(3, pk.getContributionType());
    prepStmt.setString(4, pk.getRater().getId());
      rs = prepStmt.executeQuery();
      return (rs.next());
      DBUtil.close(rs, prepStmt);
}
}
