//113
public class func{
public void testUnsuccessfulConnect(){
        String url = getTestConfiguration().getJDBCUrl("nonexistentDatabase");
        String user = getTestConfiguration().getUserName();
        String password = getTestConfiguration().getUserPassword();
            DriverManager.getConnection(url, user, password).close();
}
}
