//86
public class func{
public void getDomainCount(String macAddress){
    PreparedStatement prep = dbInstance.prepareStatement("select count(distinct d.name) as num_domains from domains d inner join requests r on d.id = r.domain_id inner join clients c on c.id = r.client_id where c.mac_address = ?;");
    prep.setString(1, macAddress);
    ResultSet rs = prep.executeQuery();
      rs.next();
      int numDomains = rs.getInt("num_domains");
      rs.close();
}
}
