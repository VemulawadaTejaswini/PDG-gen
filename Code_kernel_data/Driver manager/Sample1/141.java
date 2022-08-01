//140
public class func{
	public void updateTestType1(){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
            Statement ps1 = conn.createStatement();
            ps1.executeUpdate("UPDATE PLANET SET NAME='Mercury' WHERE POSITION=4");
}
}
