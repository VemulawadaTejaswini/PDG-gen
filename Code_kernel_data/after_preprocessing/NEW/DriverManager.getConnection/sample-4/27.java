//27
public class func{
public void createConnection(String url,String user,String password){
        if ( password == null )
            password = Access.getPassword() ;
        return DriverManager.getConnection(url, user, password) ;
}
}
