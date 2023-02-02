//35
public class func{
public void getConnection(){
        if ( conn == null)
        {
            System.out.println("dbUrl="+dbUrl);
            conn = DriverManager.getConnection(dbUrl);
        }
}
}
