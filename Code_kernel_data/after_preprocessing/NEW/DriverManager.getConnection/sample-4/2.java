//2
public class func{
public void getAdminConnectionWithProps(Properties props){
    String adminUrl = System.getProperty(ADMIN_CONNECTION_PROPERTY_NAME);
    if (adminUrl != null) {
      return DriverManager.getConnection(adminUrl, props);
    } else {
      return null;
    }
}
}
