//721
public class func{
public void getNewConnection(){
      return DriverManager.getConnection(configuration.getDatabaseUrl(),
              configuration.getDatabaseUser(),
              configuration.getDatabasePassword());
}
}
