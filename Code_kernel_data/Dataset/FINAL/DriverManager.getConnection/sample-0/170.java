public class func{
public void getConnection(){
    conn = DriverManager.getConnection(QueryUtil.getUrl(this.conf.get(SERVER_NAME)), props).unwrap(PhoenixConnection.class);
    conn.setAutoCommit(false);
    setup(conn);
}
}
