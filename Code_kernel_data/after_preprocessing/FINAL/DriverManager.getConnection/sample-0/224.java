public class func{
public void createConnectionWithUserPassword(Properties props){
        return DriverManager.getConnection(getURL(), props);
}
}
