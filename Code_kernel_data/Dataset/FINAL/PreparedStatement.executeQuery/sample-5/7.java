public class func{
public void run(PreparedStatement stm){
                    stm.setInt(1, inviter.getUserId());
                    ResultSet rs = stm.executeQuery();
}
}
