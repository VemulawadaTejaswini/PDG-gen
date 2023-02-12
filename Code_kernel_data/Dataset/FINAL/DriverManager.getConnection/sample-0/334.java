public class func{
public void connect(String connectionString,Properties info){
        currentConnection = DriverManager.getConnection(connectionString, info);
}
}
