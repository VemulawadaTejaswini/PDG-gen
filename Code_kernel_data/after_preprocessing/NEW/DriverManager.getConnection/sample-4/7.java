//7
public class func{
public void getConnection(String connectionUrl,String username,String passwd){
        if (!connectionUrl.contains(";databaseName=")) {
            String dbname = connectionUrl.substring(connectionUrl.lastIndexOf('/') + 1);
            String url = connectionUrl.substring(0, connectionUrl.lastIndexOf('/'));
            connectionUrl = url + ";databaseName=" + dbname;
        }
        return DriverManager.getConnection(connectionUrl, username, passwd);
}
}
