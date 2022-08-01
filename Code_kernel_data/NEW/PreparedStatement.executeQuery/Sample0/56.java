//55
public class func{
	public void messageTableCount(){
        java.sql.Connection c = dataSource.getConnection();
            PreparedStatement s = c.prepareStatement("SELECT COUNT(*) FROM ACTIVEMQ_MSGS");
            ResultSet rs = s.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            if (c!=null) {
                c.close();
            }
}
}
