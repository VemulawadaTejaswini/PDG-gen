//213
public class func{
public void createConnection(final int index){
        final DatabasePlatform dbPlatform = DatabasePlatformFactory.FACTORY.getDatabasePlatform();
        return DriverManager.getConnection(
                dbPlatform.getUrl(index),
                dbPlatform.getUser(),
                dbPlatform.getPassword());
}
}
