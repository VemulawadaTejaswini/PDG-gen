public class func{
public void createConnection(){
                  DriverManager.getConnection("jdbc:optiq:");
                  connection.unwrap(OptiqConnection.class);
                  optiqConnection.getRootSchema();
}
}
