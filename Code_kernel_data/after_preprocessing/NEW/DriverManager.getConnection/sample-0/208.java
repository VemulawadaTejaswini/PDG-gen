//208
public class func{
public void shutdownDerby(int nDatabaseType){
        log.debug("about to shutdonw DerbyDB with: {}", sURL);
        DriverManager.getConnection(sURL);
}
}
