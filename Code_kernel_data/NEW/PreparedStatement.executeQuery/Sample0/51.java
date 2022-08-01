//50
public class func{
	public void checkTemplateISOUsage(Connection conn){
        PreparedStatement pstmt = conn.prepareStatement("select count(*) from cloud_usage.cloud_usage cu inner join cloud.template_zone_ref tzr " +
            "where cu.usage_id = tzr.template_id and cu.zone_id = tzr.zone_id and cu.usage_type in (7,8) and cu.start_date > tzr.removed"+lastCheckId);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next() && (rs.getInt(1) > 0)){
            errors.append("Error: Found "+rs.getInt(1)+" template/ISO usage records which are created after it is removed");
            errors.append("\n");
            return false;
        }
}
}
