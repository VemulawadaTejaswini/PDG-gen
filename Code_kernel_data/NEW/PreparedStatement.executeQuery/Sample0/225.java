//224
public class func{
	public void getAndCreatePartition(final String tableName,final Date time,final Connection conn){
            ps.setTimestamp(2, new Timestamp(time.getTime()));
            final ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString(1);
}
}
