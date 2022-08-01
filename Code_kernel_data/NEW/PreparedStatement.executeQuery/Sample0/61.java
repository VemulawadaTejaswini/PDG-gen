//60
public class func{
	public void getMessage(String messageId,Clob[] returnedData){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement stmt = conn.prepareStatement("select MESSAGE_JSON from JSON_MESSAGE where MESSAGE_ID = ?");
    stmt.setString( 1, messageId);
    ResultSet results = stmt.executeQuery();
    if (results.next()) {
      returnedData[0] = results.getClob(1);
    }
}
}
