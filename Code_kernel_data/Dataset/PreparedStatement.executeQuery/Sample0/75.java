//74
public class func{
	public void checkIsolationLevel(Connection conn){
        PreparedStatement pstmt = conn.prepareStatement("SELECT @@global.tx_isolation, @@session.tx_isolation;");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            s_logger.info("global isolation = " + rs.getString(1));
            s_logger.info("session isolation = " + rs.getString(2));
        }
}
}
