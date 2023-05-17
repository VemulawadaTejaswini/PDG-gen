//0
public class func{
public void connect(){
      if(connection != null){
        connection.close();
      }
      connection = DriverManager.getConnection(getConnectionString());
}
}
