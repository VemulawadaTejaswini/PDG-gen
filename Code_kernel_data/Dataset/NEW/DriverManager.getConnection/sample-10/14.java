//14
public class func{
public void checkDBConnection(ZooKeeperInfo.PortalDB db){
                java.sql.Connection conn = DriverManager.getConnection(connectionURL);
                conn.close();
}
}
