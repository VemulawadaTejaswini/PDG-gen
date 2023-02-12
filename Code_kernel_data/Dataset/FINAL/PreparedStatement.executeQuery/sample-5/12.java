public class func{
public void run(PreparedStatement stm){
                    stm.setInt(1, profile.getUserId());
                    ResultSet rs = stm.executeQuery();
}
}
