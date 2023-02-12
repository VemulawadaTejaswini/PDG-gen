public class func{
public void setUp(){
        Properties props = ConnectionUtil.getProperties();
        connection = DriverManager.getConnection(ConnectionUtil.getURL(), props);
}
}
