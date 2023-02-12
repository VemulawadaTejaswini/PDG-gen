public class func{
public void getConnection(){
      if (connection == null) {
        connection = DriverManager.getConnection(databaseURL, databaseUser,
          databasePassword);
      }
}
}
