public class func{
public void testCustomAuthentication(){
    Connection connection = DriverManager.getConnection(url, "hiveuser", "hive");
    connection.close();
}
}
