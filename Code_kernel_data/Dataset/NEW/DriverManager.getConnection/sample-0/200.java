//200
public class func{
public void newInstance(String url,Properties properties){
        Connection connection = DriverManager.getConnection(url, properties);
        return new Sql(connection);
}
}
