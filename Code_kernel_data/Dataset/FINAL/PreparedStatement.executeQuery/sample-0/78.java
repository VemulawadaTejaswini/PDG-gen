public class func{
public void run(PreparedStatement stm){
                stm.setString(2, value);
                ResultSet rs = stm.executeQuery();
                while (rs.next()) {
                    return rs.getInt(1) > 0;
                }
}
}
