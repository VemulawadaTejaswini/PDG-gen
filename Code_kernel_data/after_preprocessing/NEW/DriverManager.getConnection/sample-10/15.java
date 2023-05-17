//15
public class func{
public void isDBAccessible(String driverClass,String url,String user,String password){
    Connection con = DriverManager.getConnection( url , user , password );
    con.close( );
}
}
