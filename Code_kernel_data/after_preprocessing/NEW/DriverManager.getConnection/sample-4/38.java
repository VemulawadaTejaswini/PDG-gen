//38
public class func{
public void assertSystemShutdownOK(String dbName,String user,String password){
        if (usingDerbyNetClient() && dbName=="")
            // The junit test harness that kicked off the test will hang when 
            // we attempt to shutdown the system - most likely because we're
            // shutting down the system while the network server thread is
            // still alive, so it gets confused...
            return;
            DriverManager.getConnection(url2);
}
}
