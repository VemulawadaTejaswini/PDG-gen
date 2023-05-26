//199
public class func{
public void newInstance(String url,String user,String password){
        Connection connection = DriverManager.getConnection(url, user, password);
        return new Sql(connection);
}
}
