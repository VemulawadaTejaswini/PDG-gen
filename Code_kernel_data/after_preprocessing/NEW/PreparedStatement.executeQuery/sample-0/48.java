//48
public class func{
public void checkSnapshotUsage(Connection conn){
        PreparedStatement pstmt = conn.prepareStatement("select count(*) from cloud_usage.cloud_usage cu inner join cloud.snapshots s " +
            "where cu.usage_id = s.id and cu.usage_type = 9 and cu.start_date > s.removed"+lastCheckId);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next() && (rs.getInt(1) > 0)){
            errors.append("Error: Found "+rs.getInt(1)+" snapshot usage records which are created after snapshot is removed");
            errors.append("\n");
            return false;
        }
}
}
