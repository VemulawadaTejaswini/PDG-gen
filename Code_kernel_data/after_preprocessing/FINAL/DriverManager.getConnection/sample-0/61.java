public class func{
public void connect(){
        String url = (String)getSession().getDatasourceLogin().getProperty("url");
        connection = DriverManager.getConnection(url, "aquser", "aquser");
        connection.setAutoCommit(false);
}
}
