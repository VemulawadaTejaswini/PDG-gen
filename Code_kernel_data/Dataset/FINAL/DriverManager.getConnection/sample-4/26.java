public class func{
public void getConnection(){
         Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
         if (connection == null)
            throw new PersistenceException("Received null connection from the DriverManager!");
}
}
