public class func{
public void checkInstanceGroupVmMap(Connection conn,long groupId,long vmId){
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM  instance_group_vm_map WHERE group_id = ? and instance_id = ?");
        pstmt.setLong(2, vmId);
        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) {
            return false;
        } else {
            return true;
        }
}
}
