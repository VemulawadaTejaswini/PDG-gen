public class func{
public void testForcingRowKeyOrderNotUseRoundRobinIterator(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        testForceRowKeyOrder(conn, true);
}
}
