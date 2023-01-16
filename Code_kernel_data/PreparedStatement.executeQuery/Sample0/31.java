//30
public class func{
	public void readRows(String dataSourceURL,String dataSourceName){
    Connection connection = DriverManager.getConnection(dataSourceURL, USER, PASSWORD);    
    PreparedStatement stmt = connection.prepareStatement(QUERY_SELECT);
    ResultSet rs = stmt.executeQuery();
    while(rs.next()) {
      int id = rs.getInt(1);
      list.add(id);
      LOGGER.info("read {} from {}", id, dataSourceName);
    }
    rs.close();
}
}
