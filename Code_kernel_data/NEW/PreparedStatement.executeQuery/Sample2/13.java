//12
public class func{
	public void selectRows(ResultSet[] data1){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
            PreparedStatement ps1 = conn.prepareStatement("SELECT * FROM PLANET");
            data1[0] = ps1.executeQuery();
}
}
