public class func{
public void openPrivilegedDB(){
        return DriverManager.getConnection(getURL(), properties);
}
}
