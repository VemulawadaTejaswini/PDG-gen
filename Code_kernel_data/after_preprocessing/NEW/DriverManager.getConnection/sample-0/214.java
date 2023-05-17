//214
public class func{
public void getConnection(final DatabasePlatform dbPlatform){
        return DriverManager.getConnection(
                dbPlatform.getUrl(0),
                dbPlatform.getUser(),
                dbPlatform.getPassword());
}
}
