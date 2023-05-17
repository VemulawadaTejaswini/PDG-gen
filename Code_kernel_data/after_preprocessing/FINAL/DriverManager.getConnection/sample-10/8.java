public class func{
public void testConnect(){
    final Connection connection = DriverManager.getConnection("jdbc:drill:zk=local");
    connection.close();
}
}
