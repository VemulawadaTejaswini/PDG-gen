public class func{
public void createConnection(){
        String url = format("jdbc:presto:
        return DriverManager.getConnection(url, "test", null);
}
}
