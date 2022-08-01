//139
public class func{
	public void updateParameterizedTestType1(String name){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
            Statement ps1 = conn.createStatement();
            ps1.executeUpdate("UPDATE PLANET SET NAME='" + name + "' WHERE POSITION=4");
}
}
