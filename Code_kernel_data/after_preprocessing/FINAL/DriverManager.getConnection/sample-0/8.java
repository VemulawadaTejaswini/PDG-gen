public class func{
public void getConnection(String postfix){
      con1 = DriverManager.getConnection("jdbc:hive2://localhost:10000/" + postfix,
          "", "");
      con1 = DriverManager.getConnection("jdbc:hive2:///" + postfix, "", "");
    assertNotNull("Connection is null", con1);
    assertFalse("Connection should not be closed", con1.isClosed());
}
}
