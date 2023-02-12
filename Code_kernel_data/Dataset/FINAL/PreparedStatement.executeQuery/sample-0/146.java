public class func{
public void isTriggerGroupPaused(Connection conn,String groupName){
            ps = conn.prepareStatement(rtp(SELECT_PAUSED_TRIGGER_GROUP.toLowerCase()));
            ps.setString(1, groupName);
            rs = ps.executeQuery();
            return rs.next();
            closeResultSet(rs);
            closeStatement(ps);
}
}
