public class func{
public void startServer(){
        conn = DriverManager.getConnection("jdbc:voltdb://localhost:21212", "defaultadmin", "admin");
}
}
