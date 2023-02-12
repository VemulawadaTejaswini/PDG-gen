public class func{
public void HSQLDriver(String dbFileNamePrefix,String username,String password){
        conn = DriverManager.getConnection("jdbc:hsqldb:" + dbFileNamePrefix,
            username,                     // username
            password);                    // password
}
}
