public class func{
public void start(){
    String driver = dbConfig.getDriver();
    Class.forName(driver);
    String url = Utils.replaceParams(dbConfig.getDbURL(), metaData);
    Properties prop = Utils.replaceParams(dbConfig.getConfigProperty(), metaData);
    conn = DriverManager.getConnection(url, prop);
    conn.setAutoCommit(false);
}
}
