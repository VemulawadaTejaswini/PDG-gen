//4
public class func{
public void getConnection(String connectionUrl,String username,String passwd){
        if (!connectionUrl.contains("database=")) {
            String dbname = connectionUrl.substring(connectionUrl.lastIndexOf('/') + 1);
            String url = connectionUrl.substring(0, connectionUrl.lastIndexOf('/'));
            String port = url.substring(url.lastIndexOf(":") + 1);
            port = port.isEmpty() ? "" : ",dbs_port=" + port;
            url = url.substring(0, url.lastIndexOf(":"));
            connectionUrl = url + "/database=" + dbname + ",charset=UTF8" + port;
        }
        return DriverManager.getConnection(connectionUrl, username, passwd);
}
}
