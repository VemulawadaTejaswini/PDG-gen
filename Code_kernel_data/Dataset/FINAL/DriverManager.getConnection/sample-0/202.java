public class func{
public void createConnection(String catalog){
        String url = format("jdbc:presto:
        return DriverManager.getConnection(url, "test", null);
}
}
