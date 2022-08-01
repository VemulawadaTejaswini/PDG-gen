//53
public class func{
	public void testQueueMappingCheckDisabled(){
    miniHS2.setConfProperty(
        HiveConf.ConfVars.HIVE_SERVER2_MAP_FAIR_SCHEDULER_QUEUE.varname, "false");
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user1", "bar");
}
}
