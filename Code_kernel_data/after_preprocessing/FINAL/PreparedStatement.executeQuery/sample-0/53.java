public class func{
public void isSatisified(){
               java.sql.Connection c = dataSource.getConnection();
                    PreparedStatement s = c.prepareStatement("SELECT LAST_ACKED_ID FROM ACTIVEMQ_ACKS WHERE PRIORITY=" + priority);
                    ResultSet rs = s.executeQuery();
                    if (rs.next()) {
                        id = rs.getInt(1);
                    }
                    if (c!=null) {
                        c.close();
                    }
}
}
