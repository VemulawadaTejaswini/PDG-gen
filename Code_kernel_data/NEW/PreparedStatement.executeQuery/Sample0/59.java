//58
public class func{
	public void run(PreparedStatement stm){
                            stm.setInt(1, profile.getUserId());
                            ResultSet rs = stm.executeQuery();
                            while (rs.next()) {
                                String bagName = rs.getString("sharer");
                                if (!ret.containsKey(bagName)) {
                                    ret.put(bagName, new HashSet<String>());
                                }
                                ret.get(bagName).add(rs.getString("bagname"));
                            }
}
}
