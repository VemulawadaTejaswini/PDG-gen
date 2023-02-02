//112
public class func{
public void testSuccessfulConnect(){
        String user = getTestConfiguration().getUserName();
        String password = getTestConfiguration().getUserPassword();
        DriverManager.getConnection(url, user, password).close();
}
}
