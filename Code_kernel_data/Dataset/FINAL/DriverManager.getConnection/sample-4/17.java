public class func{
public void getConnectionInternal(String url,Properties properties){
    Enumeration<java.sql.Driver> drivers =  DriverManager.getDrivers();
    while (drivers.hasMoreElements()) {
      java.sql.Driver driver = (java.sql.Driver) drivers.nextElement();
      if(!(driver instanceof Driver)) {
        DriverManager.deregisterDriver(driver);
      }
    }
    return DriverManager.getConnection(url, properties);
}
}
