public class func{
public void getConnection(){
        return DriverManager.getConnection(driverProperties.getDatabaseConnectionUrl());
}
}
