//52
public class func{
public void testFairSchedulerSecondaryQueueMapping(){
    miniHS2.setConfProperty(FairSchedulerConfiguration.ALLOCATION_FILE, "fair-scheduler-test.xml");
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user3", "bar");
}
}
