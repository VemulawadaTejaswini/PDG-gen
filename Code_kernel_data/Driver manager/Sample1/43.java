//42
public class func{
	public void dynamicResults(ResultSet[] rs1,ResultSet[] rs2){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        rs1[0] = c.createStatement().executeQuery("VALUES(1)");
        rs2[0] = c.createStatement().executeQuery("VALUES(2)");
}
}
