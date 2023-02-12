public class func{
public void shutdownDatabase(){
                DriverManager.getConnection(url + ";shutdown=true");
}
}
