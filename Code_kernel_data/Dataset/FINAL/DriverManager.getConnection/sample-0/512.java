public class func{
public void getTestDbConnection(){
      _connection = DriverManager
          .getConnection("jdbc:hsqldb:res:metamodel");
      _connection.setReadOnly(true);
}
}
