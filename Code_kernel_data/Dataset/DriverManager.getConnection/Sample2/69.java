//68
public class func{
	public void countTestRecords(int[] count){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
            Statement ps1 = conn.createStatement();
            ResultSet resultSet = ps1.executeQuery("SELECT COUNT(*) FROM PLANET");
            resultSet.next();
            count[0] = resultSet.getInt(1);
}
}
