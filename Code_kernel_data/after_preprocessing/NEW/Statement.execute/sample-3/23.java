//23
public class func{
public void initializeConnection(Connection connection){
    Statement stmt = connection.createStatement();
      stmt.execute("SET DATABASE SQL DOUBLE NAN FALSE");
      stmt.close();
}
}
