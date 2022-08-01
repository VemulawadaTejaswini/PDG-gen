//162
public class func{
	public void testNoUserOrPassword(){
      Connection c = DriverManager.getConnection(
          "jdbc:derby://" + getTestConfiguration().getHostName()
                    + ":" + getTestConfiguration().getPort() + "/testbase");
}
}
