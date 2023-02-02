//223
public class func{
public void connectWithOldVersion(String url,Properties info){
        url = "jdbc:h2v1_1:" + url.substring("jdbc:h2:".length()) +
        return DriverManager.getConnection(url, info);
}
}
