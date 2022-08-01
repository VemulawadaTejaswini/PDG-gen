//145
public class func{
	public void setLabel(String labelName){
            DriverManager.getConnection("jdbc:default:connection");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("alter session set \"label\" = " + labelName);
}
}
