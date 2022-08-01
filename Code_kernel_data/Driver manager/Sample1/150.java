//149
public class func{
	public void cleanTable(){
      Connection con = DriverManager.getConnection(URL);
      Statement stmt = con.createStatement();
      stmt.executeUpdate(cleanTable);
}
}
