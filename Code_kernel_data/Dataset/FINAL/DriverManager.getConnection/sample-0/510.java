public class func{
public void setUpBeforeClass(){
      Connection con = DriverManager.getConnection("jdbc:derby:memory:" + dbName + ";create=true");
      new CreateJdbcDb(con).createDatabase();
}
}
