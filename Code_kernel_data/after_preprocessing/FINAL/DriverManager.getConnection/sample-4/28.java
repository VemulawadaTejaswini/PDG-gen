public class func{
public void getConnection(){
    if (connection ==null || connection.isClosed())
     connection = DriverManager.getConnection(dbUrl, "sa", "");
}
}
