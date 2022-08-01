//160
public class func{
	public void testBadConnectionAttribute(){
      Connection c = DriverManager.getConnection(
          "jdbc:derby://" + getTestConfiguration().getHostName()
                    + ":" + getTestConfiguration().getPort() + "/badAttribute;upgrade=notValidValue");
}
}
