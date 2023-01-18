//162
public class func{
	public void run(PreparedStatement stm){
                        stm.setInt(1, bag.getSavedBagId());
                        ResultSet rs = stm.executeQuery();
                        while (rs.next()) {
                            usersWithAccess.add(rs.getString(1));
                        }
}
}
