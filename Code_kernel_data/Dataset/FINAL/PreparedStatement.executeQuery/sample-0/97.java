public class func{
public void getSubSpaces(Connection con,int spaceId){
      stmt = con.prepareStatement(querySortedSubSpaces);
      stmt.setInt(1, spaceId);
      rs = stmt.executeQuery();
      while (rs.next()) {
        spaces.add(fetchSpace(rs));
      }
      DBUtil.close(rs, stmt);
}
}
