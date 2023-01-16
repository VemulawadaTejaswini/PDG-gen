//157
public class func{
	public void showSuppliers(ResultSet[] rs){
        Connection con = DriverManager.getConnection("jdbc:default:connection");
        Statement stmt = con.createStatement();
        rs[0] = stmt.executeQuery(query);
}
}
