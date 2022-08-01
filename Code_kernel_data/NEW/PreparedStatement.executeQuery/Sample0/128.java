//127
public class func{
	public void addMissingOvsAccount(Connection conn){
            PreparedStatement pstmt = conn.prepareStatement("SELECT * from ovs_tunnel_account");
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                s_logger.debug("Adding missing ovs tunnel account");
                pstmt =
                    conn.prepareStatement("INSERT INTO `cloud`.`ovs_tunnel_account` (`from`, `to`, `account`, `key`, `port_name`, `state`) VALUES (0, 0, 0, 0, 'lock', 'SUCCESS')");
                pstmt.executeUpdate();
            }
}
}
