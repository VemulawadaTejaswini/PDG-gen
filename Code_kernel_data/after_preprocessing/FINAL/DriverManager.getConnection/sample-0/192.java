public class func{
public void createConnection(String dbname,String host,String port,String user,String passwd,boolean profileSQL){
        String url = makeURL(dbname, host, port, user, passwd, profileSQL);
        connection = DriverManager.getConnection(url);
        logger.info("opening ConnectionURL: " + url);
}
}
