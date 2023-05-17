//209
public class func{
public void createConnection(String catalog,String schema){
        String url = format("jdbc:presto://%s/%s/%s", server.getAddress(), catalog, schema);
        return DriverManager.getConnection(url, "test", null);
}
}
