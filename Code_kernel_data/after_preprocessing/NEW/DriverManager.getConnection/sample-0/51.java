//51
public class func{
public void testFairSchedulerPrimaryQueueMapping(){
    miniHS2.setConfProperty(FairSchedulerConfiguration.ALLOCATION_FILE, "fair-scheduler-test.xml");
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user2", "bar");
}
}
