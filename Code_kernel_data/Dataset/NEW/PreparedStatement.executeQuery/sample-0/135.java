//135
public class func{
public void getNewestRequestID(int client_id,int domain_id){
      PreparedStatement prep = dbInstance.prepareStatement("select id from requests where client_id = ? and domain_id = ? order by id desc limit 1;");
      prep.setInt(2, domain_id);
      ResultSet rs = prep.executeQuery();
      rs.next();
      int value = rs.getInt("id");
      rs.close();
}
}
