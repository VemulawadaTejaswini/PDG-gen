//171
public class func{
	public void retrieveClosedResult(ResultSet[] closed){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        closed[0] = c.createStatement().executeQuery("VALUES(1)");
        closed[0].close();
}
}
