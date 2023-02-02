//0
public class func{
public void getConnection(){
        if (username == null && password == null) {
            log.log(Level.FINE, "connect to {0}", connectionUrl);
            conn = DriverManager.getConnection(connectionUrl);
        } else {
            log.log(Level.FINE, "connect to {0} with ''{1}''/''{2}''",
                    new Object[] { connectionUrl, username, password });
            conn = DriverManager.getConnection(connectionUrl, username, password);
        }
        return new DatabaseConnection(conn, schema);
}
}
