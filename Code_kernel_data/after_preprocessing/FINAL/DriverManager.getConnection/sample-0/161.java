public class func{
public void testDatabaseNotFound(){
      Connection c = DriverManager.getConnection(
          "jdbc:derby:
                    + ":" + getTestConfiguration().getPort() + "/testbase", p);
}
}
