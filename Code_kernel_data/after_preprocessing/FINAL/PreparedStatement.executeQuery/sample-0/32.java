public class func{
public void upgradeGuestOs(Connection conn){
            PreparedStatement pstmt = conn.prepareStatement("SELECT * from guest_os WHERE id=138");
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                pstmt = conn.prepareStatement("INSERT INTO `cloud`.`guest_os` (id, category_id, display_name) VALUES (138, 7, 'None')");
                pstmt.executeUpdate();
                s_logger.debug("Inserted NONE category to guest_os table");
            }
            rs.close();
}
}
