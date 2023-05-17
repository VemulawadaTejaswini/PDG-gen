public class func{
public void retrieveExternalResult(String dbName,String user,String password,ResultSet[] external){
        Connection conn = DriverManager.getConnection(url, user, password);
            conn.createStatement().executeQuery("VALUES(1)");
}
}
