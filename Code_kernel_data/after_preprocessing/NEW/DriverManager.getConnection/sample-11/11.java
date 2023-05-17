//11
public class func{
public void getConnection(){
    connectionProps.put("user", CommonConfiguration.getProperty("datanucleus.ConnectionUserName","context0"));
    connectionProps.put("password", CommonConfiguration.getProperty("datanucleus.ConnectionPassword","context0"));
    conn = DriverManager.getConnection(
           CommonConfiguration.getProperty("datanucleus.ConnectionURL","context0"),
           connectionProps);
}
}
