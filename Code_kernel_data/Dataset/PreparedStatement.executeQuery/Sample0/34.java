//33
public class func{
	public void dropIndexIfExists(Connection conn){
            PreparedStatement pstmt = conn.prepareStatement("SHOW INDEX FROM domain WHERE KEY_NAME = 'path'");
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                pstmt = conn.prepareStatement("ALTER TABLE `cloud`.`domain` DROP INDEX `path`");
                pstmt.executeUpdate();
                s_logger.debug("Unique key 'path' is removed successfully");
            }
            rs.close();
}
}
