//148
public class func{
public void setup(){
      Connection con = DriverManager.getConnection(URL);
      Statement stmt = con.createStatement();
      stmt.executeUpdate(createTable);
}
}
