public class func{
public void testBadConnectionAttribute(){
      Connection c = DriverManager.getConnection(
          "jdbc:derby:
                    + ":" + getTestConfiguration().getPort() + "/badAttribute;upgrade=notValidValue");
}
}
