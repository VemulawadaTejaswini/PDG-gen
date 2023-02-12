public class func{
public void getConnection(Connection c){
            Properties props = new Properties();
            props.setProperty("requireExistingEngine", "true");
            c = DriverManager.getConnection(urlPrefix, props);
}
}
