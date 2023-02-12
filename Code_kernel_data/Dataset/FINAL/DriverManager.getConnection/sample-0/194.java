public class func{
public void runTest(){
        Driver d2 = DriverManager.getDriver("jdbc:h2v1_1:mem:test");
        connection = DriverManager.getConnection("jdbc:h2:mem:test");
        DriverManager.deregisterDriver(d2);
}
}
