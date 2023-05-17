public class func{
public void initConnection(){
      final Connection connection = DriverManager.getConnection(String.format("jdbc:sqlite:%s", myDbFile.getPath()));
      if (! existed && myInitDbScript != null) {
        myInitDbScript.consume(connection);
      }
      connection.setAutoCommit(false);
}
}
