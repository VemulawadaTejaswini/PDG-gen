public class func{
public void getConnection(String postfix){
      con1 = DriverManager.getConnection("jdbc:hive2:
          "", "");
      con1 = DriverManager.getConnection("jdbc:hive2:
    assertNotNull("Connection is null", con1);
    assertFalse("Connection should not be closed", con1.isClosed());
}
}
