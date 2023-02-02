//534
public class func{
	public void testPlanForOrderByOrGroupByNotUseRoundRobin(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        testOrderByOrGroupByDoesntUseRoundRobin(conn, false);
}
}
