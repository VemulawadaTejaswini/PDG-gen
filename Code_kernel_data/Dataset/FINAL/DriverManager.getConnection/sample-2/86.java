public class func{
public void retrieveExternalResult(String dbName,String user,String password,ResultSet[] external){
        Connection conn = DriverManager.getConnection(create_url);
        external[0] = conn.createStatement().executeQuery("VALUES(1)");
}
}
