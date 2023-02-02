//433
public class func{
public void setUp(){
        zkQuorum = "localhost:" + hbaseTestUtil.getZkCluster().getClientPort();
        conn = DriverManager.getConnection(PhoenixRuntime.JDBC_PROTOCOL
                + PhoenixRuntime.JDBC_PROTOCOL_SEPARATOR + zkQuorum);
}
}
