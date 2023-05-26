public class func{
public void openSlaveDB(){
        return DriverManager.getConnection(TestUtil.getURL(getSlaveServer(), getSlavePort()), props);
}
}
