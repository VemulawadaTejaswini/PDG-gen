//40
public class func{
	public void i_getMostRecentRebuild(Connection conn){
        PreparedStatement stmt = conn.prepareStatement(GET_MOST_RECENT_REBUILD);
            rs = stmt.executeQuery();
            if (rs.next()) {
                mostRecent = rs.getLong(1);
            }
            if (rs != null) rs.close();
            stmt.close();
}
}
