//161
public class func{
public void testDatabaseNotFound(){
      Connection c = DriverManager.getConnection(
          "jdbc:derby://" + getTestConfiguration().getHostName()
                    + ":" + getTestConfiguration().getPort() + "/testbase", p);
}
}
