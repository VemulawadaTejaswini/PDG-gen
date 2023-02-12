public class func{
public void stop(BundleContext context){
            DriverManager.getConnection(getDerbyJDBC_Shutdown("db"));
}
}
