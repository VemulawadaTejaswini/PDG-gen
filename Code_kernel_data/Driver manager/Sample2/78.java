//77
public class func{
	public void accessSql(){
                DriverManager.getConnection(
                    "jdbc:default:connection");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("values 777");
            rs.next();
            return rs.getInt(1);
}
}
