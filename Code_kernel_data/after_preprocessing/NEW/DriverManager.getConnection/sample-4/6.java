//6
public class func{
public void shutdownDatabase(String url){
        if (url.startsWith("jdbc:derby:") || url.startsWith("jdbc:hsqldb:")) {
            try {
                DriverManager.getConnection(url + ";shutdown=true");
            } catch (SQLException e) {
                // ignore
            }
        }
}
}
