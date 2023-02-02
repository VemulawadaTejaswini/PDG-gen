//9
public class func{
public void initConnection(){
      final Connection connection = DriverManager.getConnection(String.format("jdbc:sqlite:%s", myDbFile.getPath()));
      if (! existed && myInitDbScript != null) {
        // ok to run under lock => no read is possible until initialized
        myInitDbScript.consume(connection);
      }
      connection.setAutoCommit(false);
}
}
